/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.KategoriDAO;
import entity.Kategori;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author user
 */
public class KategoriDAOImpl implements KategoriDAO{
    
    private EntityManager em;
    
    public KategoriDAOImpl(EntityManager em){
        this.em = em;
    }

    @Override
    public void insert(Kategori kategori) {
        try{
            this.em.persist(kategori);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Kategori kategori) {
        try{
            this.em.merge(kategori);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(long id) {
        try{
            this.em.remove(this.em.find(Kategori.class, id));
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public Kategori getById(long id) {
        Kategori kat = null;
        try{
            kat = this.em.find(Kategori.class, id);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return kat;
    }

    @Override
    public List<Kategori> getAll() {
        List<Kategori> kategories = new ArrayList<Kategori>();
        try{
            kategories = this.em.createQuery("SELECT k FROM Kategori k")
                    .getResultList();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return kategories;
    }
    
}
