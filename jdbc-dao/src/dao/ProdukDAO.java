/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import obj.Produk;

/**
 *
 * @author user
 */
public interface ProdukDAO {
    public void insert(Produk produk);
    public void update(Produk produk);
    public void delete(int id);
    public Produk getById(int id);
    public List<Produk> getAll();
}
