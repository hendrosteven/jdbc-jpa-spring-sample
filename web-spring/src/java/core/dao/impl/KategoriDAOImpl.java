/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao.impl;

import core.dao.KategoriDAO;
import entity.Kategori;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Repository("kategoriDAO")
@Transactional
public class KategoriDAOImpl extends GeneralDAOImpl implements KategoriDAO {

    @Override
    public Kategori getById(long id) {
        return this.em.find(Kategori.class, id);
    }

    @Override
    public List<Kategori> getAll() {
        return this.em.createQuery("SELECT k FROM Kategori k")
                .getResultList();
    }

}
