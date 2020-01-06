/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mong;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import mong.Pendaftaran;
import mong.PendaftaranFacade;

/**
 *
 * @author ACER-NITRO
 */
public class EditPendaftaran extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            
            String pesan = null;
            String id = request.getParameter("id");
            String nama = request.getParameter("nama");
            String jk = request.getParameter("jk");
            String nohp = request.getParameter("nohp");
            String alamat = request.getParameter("alamat");
            String username = request.getParameter("username");
            String password= request.getParameter("password");
            
            Pendaftaran pen = new Pendaftaran();
            pen.setId(Integer.parseInt(id));
            pen.setNamaPendaftar(nama);
            pen.setJkPendaftar(jk);
            pen.setNohpPendaftar(nohp);
            pen.setAlamat(alamat);
            pen.setUsername(username);
            pen.setPassword(password);
            
            PendaftaranFacade oii = new PendaftaranFacade();
            
            if(oii.store(pen)==true){
                pesan= "berhasil disimpan";
            }
            else{
                pesan = "gagal disimpan";
            }
            request.setAttribute("pesan", pesan);
            request.setAttribute("pen", pen);
            RequestDispatcher control = null;
            control = getServletContext().getRequestDispatcher("/Login/afterEdit.jsp");
            control.forward(request, response);
        }
        finally{
            out.close();
        }
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
