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
public class ProdukDAOImpl extends GeneralDAOImpl implements ProdukDAO {

    public ProdukDAOImpl(EntityManager em) {
        super(em);
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

    @Override
    public List<Produk> getByNama(String key) {
        List<Produk> produks = new ArrayList<Produk>();
        try {
            produks = this.em.createQuery("SELECT p FROM Produk "
                    + "p WHERE p.nama LIKE :param")
                    .setParameter("param", "%" + key + "%")
                    .getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return produks;
    }

}
