/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pajak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class UbahData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/dblatihan";
            String user = "root";
            String pass = "admin";
            Connection conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement pst = conn.prepareStatement("UPDATE tbl_produk "
                    + "SET kode=?, nama=?, harga=? WHERE id=?");
            int id = 2;
            String kode = "006";
            String nama = "Speker Aktif";
            double harga = 500000;

            pst.setString(1, kode);
            pst.setString(2, nama);
            pst.setDouble(3, harga);
            pst.setInt(4, id);
            
            pst.executeUpdate();
                        
            System.out.println("Done!");
            
            pst.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
