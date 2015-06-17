/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ProdukDAO;
import entity.Produk;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author user
 */
public class ProdukDAOImpl implements ProdukDAO {

    private EntityManager em;

    public ProdukDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void insert(Produk produk) {
        this.em.getTransaction().begin();
        try {
            this.em.persist(produk);
            this.em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            this.em.getTransaction().rollback();
        }
    }

    @Override
    public void update(Produk produk) {
        this.em.getTransaction().begin();
        try {
            this.em.merge(produk);
            this.em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            this.em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(long id) {
        this.em.getTransaction().begin();
        try {
            this.em.remove(this.em.find(Produk.class, id));
              this.em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
              this.em.getTransaction().rollback();
        }
    }

    @Override
    public Produk getById(long id) {
        Produk produk = null;
        try {
            produk = this.em.find(Produk.class, id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return produk;
    }

    @Override
    public List<Produk> getAll() {
        List<Produk> produks = new ArrayList<Produk>();
        try {
            produks = this.em.createQuery("SELECT p FROM Produk p")
                    .getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return produks;
    }

}
