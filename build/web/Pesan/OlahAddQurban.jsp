<%-- 
    Document   : OlahAddQurban
    Created on : Jan 4, 2020, 12:51:16 PM
    Author     : ACER-NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="qurban.Qurban" %>
<%@page import="qurban.QurbanFacade"%>
<%
//    String id_pen = request.getParameter("id");
    String nama_qur = request.getParameter("nama");
    String masjid_qur = request.getParameter("masjid");
    String kelompok_qur = request.getParameter("kelompok");
    String harga_qur = request.getParameter("harga");
    String byr_qur = request.getParameter("bayar");
    
    Qurban qur = new Qurban();
//    pen.setId(Integer.parseInt(id_pen));
    qur.setNamaPequrban(nama_qur);
    qur.setMasjid(masjid_qur);
    qur.setKelompok(kelompok_qur);
    qur.setHarga(Integer.parseInt(harga_qur));
    qur.setBayar(byr_qur);
    request.setAttribute("dataQur", qur);
    
    QurbanFacade quur = new QurbanFacade();
    if (quur.create(qur)== true) {%>
    <jsp:forward page="BerhasilQurban.jsp"/><%
    }
    else{
    %>
    <jsp:forward page="../Home/Home.jsp"/><%    
    }
    %>
