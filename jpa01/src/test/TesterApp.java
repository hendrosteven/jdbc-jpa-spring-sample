/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.KategoriDAO;
import dao.ProdukDAO;
import dao.impl.KategoriDAOImpl;
import dao.impl.ProdukDAOImpl;
import entity.Produk;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class TesterApp {

    public static void main(String[] args) {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("jpa01PU");
        EntityManager em = emf.createEntityManager();

        KategoriDAO katDao = new KategoriDAOImpl(em);
        
        Produk produk = new Produk();
        produk.setKode("P002");
        produk.setNama("Monitor 21 inc LG");
        produk.setHarga(120000);
        produk.setKategori(katDao.getById(1));
        
        ProdukDAO prodDAO = new ProdukDAOImpl(em);
        prodDAO.insert(produk);
        System.out.println("Done!");

    }

}
