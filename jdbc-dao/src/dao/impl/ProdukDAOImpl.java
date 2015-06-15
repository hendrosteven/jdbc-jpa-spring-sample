/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ProdukDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import obj.Produk;

/**
 *
 * @author user
 */
public class ProdukDAOImpl implements ProdukDAO {

    private Connection conn;

    public ProdukDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Produk produk) {
        String sql = "INSERT INTO tbl_produk(kode,nama,harga) VALUES(?,?,?)";
        try {
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, produk.getKode());
            pst.setString(2, produk.getNama());
            pst.setDouble(3, produk.getHarga());
            pst.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Produk produk) {
        String sql = "UPDATE tbl_produk SET kode=?,nama=?,harga=? WHERE id=?";
        try {
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setString(1, produk.getKode());
            pst.setString(2, produk.getNama());
            pst.setDouble(3, produk.getHarga());
            pst.setInt(4, produk.getId());
            pst.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM tbl_produk WHERE id=?";
        try {
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Produk getById(int id) {
        Produk produk = null;
        String sql = "SELECT id,kode,nama,harga,id_kategori FROM tbl_produk WHERE id=?";
        try {
            PreparedStatement pst = this.conn.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                produk = new Produk();
                produk.setId(rs.getInt("id"));
                produk.setKode(rs.getString("kode"));
                produk.setNama(rs.getString("nama"));
                produk.setHarga(rs.getDouble("harga"));
                produk.setKategori(
                        new KategoriDAOImpl(this.conn)
                                .getById(rs.getInt("id_kategori")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return produk;
    }

    @Override
    public List<Produk> getAll() {
        List<Produk> produks = new ArrayList<Produk>();
        String sql = "SELECT id,kode,nama,harga,id_kategori FROM tbl_produk";
        try {
            PreparedStatement pst = this.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Produk produk = new Produk();
                produk.setId(rs.getInt("id"));
                produk.setKode(rs.getString("kode"));
                produk.setNama(rs.getString("nama"));
                produk.setHarga(rs.getDouble("harga"));
                produk.setKategori(
                        new KategoriDAOImpl(this.conn)
                                .getById(rs.getInt("id_kategori")));
                produks.add(produk);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return produks;
    }

}
