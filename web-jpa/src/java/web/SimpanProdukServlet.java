/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import dao.KategoriDAO;
import dao.ProdukDAO;
import dao.impl.KategoriDAOImpl;
import dao.impl.ProdukDAOImpl;
import entity.Produk;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class SimpanProdukServlet extends HttpServlet {
      EntityManagerFactory emf
            = Persistence.createEntityManagerFactory("web-jpaPU");

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String kode = request.getParameter("txtKode");
        String nama = request.getParameter("txtNama");
        double harga = Double.valueOf(request.getParameter("txtHarga"));
        long idKategori = Long.valueOf(request.getParameter("selKategori"));
        
        EntityManager em = emf.createEntityManager();
        KategoriDAO katDAO = new KategoriDAOImpl(em);
        ProdukDAO proDAO = new ProdukDAOImpl(em);
        
        Produk produk = new Produk();
        produk.setKode(kode);
        produk.setNama(nama);
        produk.setHarga(harga);
        produk.setKategori(katDAO.getById(idKategori));
        proDAO.insert(produk);
        
        response.sendRedirect("produk");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
