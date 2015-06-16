/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.KategoriDAO;
import dao.ProdukDAO;
import entity.Produk;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author user
 */
public class TesterApp {

    public static void main(String[] args) {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("appconfig.xml");
        ProdukDAO dao = (ProdukDAO) ctx.getBean("produkDAO");        
        for (Produk produk : dao.getAll()) {
            System.out.println(produk.getNama()+" "+produk.getKategori().getNama());
        }
        
        //nambah produk
        KategoriDAO kDao = (KategoriDAO) ctx.getBean("kategoriDAO");
        
        Produk prod = new Produk();
        prod.setKode("008");
        prod.setNama("Webcamp");
        prod.setHarga(200000);
        prod.setKategori(kDao.getById(2));
        dao.insert(prod);
        System.out.println("Done!");
    }
}
