/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author user
 */
public class KategoriMapper implements RowMapper<Kategori> {
    @Override
    public Kategori mapRow(ResultSet rs, int i) throws SQLException {
        Kategori temp = new Kategori();
        temp.setId(rs.getInt("id"));
        temp.setKode(rs.getString("kode"));
        temp.setNama(rs.getString("nama"));
        return temp;
    }
}
