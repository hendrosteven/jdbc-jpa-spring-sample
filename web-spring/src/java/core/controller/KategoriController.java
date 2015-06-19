/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.controller;

import core.dao.KategoriDAO;
import entity.Kategori;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/kategori")
public class KategoriController {

    @Autowired
    private KategoriDAO kategoriDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String getAll(ModelMap model) {
        model.addAttribute("kategoris", kategoriDAO.getAll());
        return "daftar_kategori";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(HttpServletRequest request) {
        long id = Long.valueOf(request.getParameter("txtId"));
        String kode = request.getParameter("txtKode");
        String nama = request.getParameter("txtNama");
        Kategori kat = new Kategori();
        kat.setId(id);
        kat.setKode(kode);
        kat.setNama(nama);
        kategoriDAO.update(kat);
        return "redirect:/kategori";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(HttpServletRequest request) {
        long id = Long.valueOf(request.getParameter("id"));
        kategoriDAO.delete(kategoriDAO.getById(id));
        return "redirect:/kategori";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(HttpServletRequest request) {
        String kode = request.getParameter("txtKode");
        String nama = request.getParameter("txtNama");
        Kategori kat = new Kategori();
        kat.setKode(kode);
        kat.setNama(nama);
        kategoriDAO.insert(kat);
        return "redirect:/kategori";
    }
    
     @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insert(){
        return "input_kategori";
    }

}
