/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import dao.KategoriDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author user
 */
public class ProdukMapper implements RowMapper<Produk>{

    private KategoriDAO kategoriDAO;
    public ProdukMapper(KategoriDAO kategoriDAO){
        this.kategoriDAO = kategoriDAO;
    }
    
    @Override
    public Produk mapRow(ResultSet rs, int i) throws SQLException {
       Produk temp = new Produk();
       temp.setId(rs.getInt("id"));
       temp.setKode(rs.getString("kode"));
       temp.setNama(rs.getString("nama"));
       temp.setHarga(rs.getDouble("harga"));
       temp.setKategori(this.kategoriDAO.getById(rs.getInt("id_kategori")));
       return temp;
    }
    
}
