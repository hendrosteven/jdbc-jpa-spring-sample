/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.KategoriDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import obj.Kategori;

/**
 *
 * @author user
 */
public class KategoriDAOImpl implements KategoriDAO {

    private Connection conn;

    public KategoriDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Kategori kategori) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Kategori kategori) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Kategori getById(int id) {
        String sql = "SELECT id,kode,nama FROM tbl_kategori WHERE id=?";
        Kategori kategori = null;
        try {
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                kategori = new Kategori();
                kategori.setId(rs.getInt("id"));
                kategori.setKode(rs.getString("kode"));
                kategori.setNama(rs.getString("nama"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return kategori;
    }

    @Override
    public List<Kategori> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
