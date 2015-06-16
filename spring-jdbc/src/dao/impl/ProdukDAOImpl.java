/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.KategoriDAO;
import dao.ProdukDAO;
import entity.Produk;
import entity.ProdukMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository("produkDAO")
public class ProdukDAOImpl implements ProdukDAO {

    @Autowired
    private JdbcTemplate template;
    @Autowired
    private KategoriDAO kategoriDAO;

    @Override
    public void insert(Produk produk) {
        this.template.update("INSERT INTO tbl_produk(kode,nama,"
                + "harga,id_kategori) VALUES(?,?,?,?)", produk.getKode(),
                produk.getNama(), produk.getHarga(),
                produk.getKategori().getId());
    }

    @Override
    public void update(Produk produk) {
        this.template.update("UPDATE tbl_produk SET kode=?,nama=?,"
                + "harga=?,id_kategori=? WHERE id=?", produk.getKode(),
                produk.getNama(), produk.getHarga(),
                produk.getKategori().getId(),
                produk.getId());
    }

    @Override
    public void delete(int id) {
        this.template.update("DELETE FROM tbl_produk WHERE id=?", id);
    }

    @Override
    public Produk getById(int id) {
        String sql = "SELECT id,kode,nama,harga,id_kategori FROM tbl_produk "
                + "WHERE id=?";
        return this.template.queryForObject(sql, new Object[]{id},
                new ProdukMapper(this.kategoriDAO));
    }

    @Override
    public List<Produk> getAll() {
        String sql = "SELECT id,kode,nama,harga,id_kategori FROM tbl_produk";
        return this.template.query(sql, new ProdukMapper(this.kategoriDAO));
    }

}
