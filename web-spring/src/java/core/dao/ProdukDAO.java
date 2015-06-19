/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;

import entity.Produk;
import java.util.List;

/**
 *
 * @author user
 */
public interface ProdukDAO extends GeneralDAO {

    public Produk getById(long id);
    public List<Produk> getAll();
    public List<Produk> getByNama(String key);
}
