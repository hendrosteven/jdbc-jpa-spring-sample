/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.controller;

import core.dao.ProdukDAO;
import entity.Produk;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/produk")
public class ProdukController {

    @Autowired
    private ProdukDAO produkDAO;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Produk> getAll() {
        return produkDAO.getAll();
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String daftar() {
        return "daftar_produk";
    }
}
