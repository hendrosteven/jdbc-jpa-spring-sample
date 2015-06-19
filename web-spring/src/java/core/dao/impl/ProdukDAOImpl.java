/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao.impl;

import core.dao.ProdukDAO;
import entity.Produk;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Repository("produkDAO")
@Transactional
public class ProdukDAOImpl extends GeneralDAOImpl implements ProdukDAO {

    @Override
    public Produk getById(long id) {
        return this.em.find(Produk.class, id);
    }

    @Override
    public List<Produk> getAll() {
        return this.em.createQuery("SELECT p FROM Produk p")
                .getResultList();
    }

    @Override
    public List<Produk> getByNama(String key) {
        return this.em.createQuery("SELECT p FROM Produk "
                + "p WHERE p.nama LIKE :param")
                .setParameter("param", "%" + key + "%")
                .getResultList();

    }
}
