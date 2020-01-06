<%-- 
    Document   : BerhasilQurban
    Created on : Jan 4, 2020, 1:04:46 PM
    Author     : ACER-NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="../Bingkai/header.html"></jsp:include>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:useBean id="qur" class="qurban.Qurban"/>
    <%
      qur = (qurban.Qurban)request.getAttribute("dataQur");
    %>
    <body>
      <section id="main-content">
      <section class="wrapper">
    <center>
        <h1 align="center"> Berhasil Ditambahkan </h1>
      <hr/>
        <table>
            <tr>
                <td>Nama Pequrban</td>
                <td>:</td>
                <td><%=qur.getNamaPequrban()%></td>
            </tr>
            <tr>
                <td>Masjid</td>
                <td>:</td>
                <td><%=qur.getMasjid()%></td>
            </tr>
            <tr>
                <td>Kelompok</td>
                <td>:</td>
                <td><%=qur.getKelompok()%></td>
            </tr>
            <tr>
                <td>Harga</td>
                <td>:</td>
                <td><%=qur.getHarga()%></td>
            </tr>
            <tr>
                <td>Metode Pembayaran</td>
                <td>:</td>
                <td><%=qur.getBayar()%></td>
            </tr>
        </table>
            <br/>
            <b>Berhasil</b>Ditambahkan, <a href="../Home/Home1.jsp">Kembali</a>
            </center>
      </section>
      </section>
    </body>
    <jsp:include page="../Bingkai/Footer.html"></jsp:include>
</html>