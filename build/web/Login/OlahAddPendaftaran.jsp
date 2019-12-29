<%-- 
    Document   : OlahAddPendaftaran
    Created on : Dec 28, 2019, 6:53:57 PM
    Author     : ACER-NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="mong.Pendaftaran" %>
<%@page import="mong.PendaftaranFacade"%>
<%
//    String id_pen = request.getParameter("id");
    String nama_pen = request.getParameter("nama");
    String jk_pen = request.getParameter("jk");
    String nohp_pen = request.getParameter("nohp");
    String alamat_pen = request.getParameter("alamat");
    String usr_pen = request.getParameter("username");
    String pass_pen = request.getParameter("password");
    
    Pendaftaran pen = new Pendaftaran();
//    pen.setId(Integer.parseInt(id_pen));
    pen.setNamaPendaftar(nama_pen);
    pen.setJkPendaftar(jk_pen);
    pen.setNohpPendaftar(nohp_pen);
    pen.setAlamat(alamat_pen);
    pen.setUsername(usr_pen);
    pen.setPassword(pass_pen);
    request.setAttribute("dataPen", pen);
    
    PendaftaranFacade kafa = new PendaftaranFacade();
    if (kafa.create(pen)== true) {%>
    <jsp:forward page="AddSukses.jsp"/><%
    }
    else{
    %>
    <jsp:forward page="../Home/Home.jsp"/><%    
    }
    %>

