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
public class KategoriDAOImpl extends GeneralDAOImpl implements KategoriDAO{

    public KategoriDAOImpl(EntityManager em) {
        super(em); //eksekusi konstruktor super classnya
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
