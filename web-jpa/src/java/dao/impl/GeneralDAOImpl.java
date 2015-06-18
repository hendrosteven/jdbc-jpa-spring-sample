/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.GeneralDAO;
import javax.persistence.EntityManager;

/**
 *
 * @author user
 */
public class GeneralDAOImpl implements GeneralDAO {

    protected EntityManager em;

    public GeneralDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void insert(Object obj) {
        this.em.getTransaction().begin();
        try {
            this.em.persist(obj);
            this.em.getTransaction().commit();
        } catch (Exception ex) {
            this.em.getTransaction().rollback();
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Object obj) {
        this.em.getTransaction().begin();
        try {
            this.em.merge(obj);
            this.em.getTransaction().commit();
        } catch (Exception ex) {
            this.em.getTransaction().rollback();
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Object obj) {
        this.em.getTransaction().begin();
        try {
            this.em.remove(this.em.merge(obj));
            this.em.getTransaction().commit();
        } catch (Exception ex) {
            this.em.getTransaction().rollback();
            ex.printStackTrace();
        }
    }

}
