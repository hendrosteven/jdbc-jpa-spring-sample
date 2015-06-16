/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.KategoriDAO;
import entity.Kategori;
import entity.KategoriMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository("kategoriDAO")
public class KategoriDAOImpl implements KategoriDAO {

    @Autowired
    private JdbcTemplate template;

    @Override
    public void insert(Kategori kategori) {
        this.template.update("INSERT INTO tbl_kategori(kode,nama) "
                + "VALUES(?,?)", kategori.getKode(), kategori.getNama());
    }

    @Override
    public void update(Kategori kategori) {
        this.template.update("UPDATE tbl_kategori SET kode=?,nama=? "
                + "WHERE id=?", kategori.getKode(), kategori.getNama(),
                kategori.getId());
    }

    @Override
    public void delete(int id) {
        this.template.update("DELETE FROM tbl_kategori WHERE id=?", id);
    }

    @Override
    public Kategori getById(int id) {
        String sql = "SELECT id,kode,nama FROM tbl_kategori WHERE id=?";
        return this.template.queryForObject(sql, new Object[]{id},
                new KategoriMapper());
    }

    @Override
    public List<Kategori> getAll() {
        String sql = "SELECT id,kode,nama FROM tbl_kategori";
        return this.template.query(sql, new KategoriMapper());
    }

}
