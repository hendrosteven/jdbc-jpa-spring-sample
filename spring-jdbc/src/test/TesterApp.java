/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.KategoriDAO;
import entity.Kategori;
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
        KategoriDAO dao = (KategoriDAO) ctx.getBean("kategoriDAO");
        for (Kategori kat : dao.getAll()) {
            System.out.println(kat.getNama());
        }
    }
}
