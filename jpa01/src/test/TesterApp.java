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

        ProdukDAO prodDAO = new ProdukDAOImpl(em);
        for(Produk p : prodDAO.getByNama("17")){
            System.out.println(p.getKode()+ " " + p.getNama());
        }

    }

}
