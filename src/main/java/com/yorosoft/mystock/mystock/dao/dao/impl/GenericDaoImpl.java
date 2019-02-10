package com.yorosoft.mystock.mystock.dao.dao.impl;

import com.yorosoft.mystock.mystock.dao.IGenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class GenericDaoImpl<E> implements IGenericDao {


    @PersistenceContext
    EntityManager em;

    private Class<E> type;

    public Class<E> getType() {
        return type;
    }

    public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class<E>) pt.getActualTypeArguments()[0];
    }

    @Override
    public Object save(Object entity) {

        em.persist(entity);
        return entity;
    }

    @Override
    public Object update(Object entity) {
        return em.merge(entity);
    }

    @Override
    public List selectAll() {

        Query query = em.createQuery("select t from " + type.getSimpleName() + " t");
        return query.getResultList();
    }

    @Override
    public List selectAll(String sortField, String sort) {
        Query query = em.createQuery("select t from " + type.getSimpleName() + " order by " + sortField + " " + sort);
        return query.getResultList();
    }

    @Override
    public Object getById(Long id) {
        return em.find(type, id);
    }

    @Override
    public void remove(Long id) {
        E tab = em.getReference(type, id);
        em.remove(tab);
    }

    @Override
    public Object findOne(String paramName, Object paramValue) {

        Query query = em.createQuery("select t from " + type.getSimpleName() + " t where " + paramName + "= :x");
        query.setParameter(paramName,paramValue);
        return query.getResultList().size()>0 ? (E) query.getResultList().get(0) : null;
    }

    @Override
    public Object findOne(String[] paramNames, Object[] paramValues) {
        if (paramNames.length != paramValues.length){
            return null;
        }
        String queryString = "select e from " + type.getSimpleName() + " e where ";
        int len = paramNames.length;
        for (int i = 0; i < len; i++){
            queryString += " e." + paramNames[i] + "= :x" + i;
            if ((i + 1) < len) {
                queryString += " and ";
            }
        }
        Query query = em.createQuery(queryString);
        for (int i = 0; i < paramValues.length; i++){
            query.setParameter("x" + i, paramValues[i]);
        }
        return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;

    }

    @Override
    public int findCountBy(String paramName, Object paramValue) {
        Query query = em.createQuery("select t from " + type.getSimpleName() + " t where " + paramName + "= :x");
        query.setParameter(paramName,paramValue);
        return query.getResultList().size()>0 ? ((Long) query.getSingleResult()).intValue() : 0;
    }
}