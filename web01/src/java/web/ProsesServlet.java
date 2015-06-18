/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import obj.Person;

/**
 *
 * @author user
 */
public class ProsesServlet extends HttpServlet {

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

        String nama = request.getParameter("txtNama");
        String alamat = request.getParameter("txtAlamat");
        String jenkel = request.getParameter("rdJenkel");
        String[] hobi = request.getParameterValues("chkHobi");

        Person person = new Person();
        person.setNama(nama);
        person.setAlamat(alamat);
        person.setJenkel(jenkel);
        person.getHobi().addAll(Arrays.asList(hobi));

        HttpSession sesi = request.getSession();
        List<Person> persons = (ArrayList<Person>) sesi.getAttribute("persons");
        if (persons == null) {
            persons = new ArrayList<Person>();
        }
        persons.add(person);
        sesi.setAttribute("persons", persons);
        
        //RequestDispatcher rd = request.getRequestDispatcher("daftar.jsp");
        //rd.forward(request, response);
        response.sendRedirect("daftar.jsp");
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
