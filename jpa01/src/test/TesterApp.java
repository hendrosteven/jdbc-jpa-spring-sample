/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Kategori;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class TesterApp {

    public static void main(String[] args){
        TesterApp tes = new TesterApp();
        Kategori kat = tes.readById(1);
        System.out.println(kat.getNama());
        kat.setNama("Monitor 20 inc");
        tes.update(kat);
        System.out.println("Done!");
        tes.delete(2);
    }
    
     public void delete(long id) {
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("jpa01PU");
        EntityManager em = emf.createEntityManager();        
        em.getTransaction().begin();
        try {
            em.remove(em.find(Kategori.class, id));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public void update(Object object) {
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("jpa01PU");
        EntityManager em = emf.createEntityManager();        
        em.getTransaction().begin();
        try {
            em.merge(object);            
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public Kategori readById(long id) {
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("jpa01PU");
        EntityManager em = emf.createEntityManager();
        Kategori kat = null;
        em.getTransaction().begin();
        try {
            kat = em.find(Kategori.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return kat;
    }
    
    
    
    public void persist(Object object) {
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("jpa01PU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        try {
            em.persist(object);            
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}
