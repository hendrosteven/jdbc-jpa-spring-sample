/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Kategori;
import java.util.List;

/**
 *
 * @author user
 */
public interface KategoriDAO {
    public void insert(Kategori kategori);
    public void update(Kategori kategori);
    public void delete(long id);
    public Kategori getById(long id);
    public List<Kategori> getAll();
}
