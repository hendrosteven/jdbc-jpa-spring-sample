/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.ProdukDAO;
import dao.impl.ProdukDAOImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import obj.Produk;

/**
 *
 * @author user
 */
public class AppTester {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/dblatihan";
            String user = "root";
            String pass = "admin";
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            ProdukDAO dao = new ProdukDAOImpl(conn);
            for(Produk produk : dao.getAll()){
                System.out.println(produk.getKode()+" "+produk.getNama() +
                        " "+ produk.getKategori().getNama());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
