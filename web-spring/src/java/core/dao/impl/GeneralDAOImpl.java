/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao.impl;

import core.dao.GeneralDAO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Repository("generalDAO")
@Transactional
public class GeneralDAOImpl implements GeneralDAO {

    @PersistenceContext
    protected EntityManager em;

    @Override
    public void insert(Object obj) {
        this.em.persist(obj);
    }

    @Override
    public void update(Object obj) {
        this.em.merge(obj);
    }

    @Override
    public void delete(Object obj) {
        this.em.remove(this.em.merge(obj));
    }

}
