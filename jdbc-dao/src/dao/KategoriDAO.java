/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import obj.Kategori;

/**
 *
 * @author user
 */
public interface KategoriDAO {
    public void insert(Kategori kategori);
    public void update(Kategori kategori);
    public void delete(int id);
    public Kategori getById(int id);
    public List<Kategori> getAll();
}
