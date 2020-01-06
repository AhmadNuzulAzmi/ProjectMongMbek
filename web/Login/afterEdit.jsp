<%-- 
    Document   : afterEdit
    Created on : Dec 30, 2019, 9:05:33 PM
    Author     : ACER-NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:useBean id="sup" class="mong.Pendaftaran"/>
    <%
      sup = (mong.Pendaftaran)request.getAttribute("pen");
      String pesan=(String)request.getAttribute("pesan");
    %>
    <body>
    <center>
        <h1 align="center"> Berhasil DiEdit </h1>
      <hr/>
        <table>
            <tr>
                <td>Nama Pendaftar</td>
                <td>:</td>
                <td><%=sup.getNamaPendaftar()%></td>
            </tr>
            <tr>
                <td>Jenis Kelamin</td>
                <td>:</td>
                <td><%=sup.getJkPendaftar()%></td>
            </tr>
            <tr>
                <td>No Hp Pendaftar</td>
                <td>:</td>
                <td><%=sup.getNohpPendaftar()%></td>
            </tr>
            <tr>
                <td>Alamat Pendaftar</td>
                <td>:</td>
                <td><%=sup.getAlamat()%></td>
            </tr>
            <tr>
                <td>Username</td>
                <td>:</td>
                <td><%=sup.getUsername()%></td>
            </tr>
            <tr>
                <td>Password</td>
                <td>:</td>
                <td><%=sup.getPassword()%></td>
            </tr>
        </table>
            <br/>
                Klik<b> Lihat</b> Untuk melihat, <a href="Login/DaftarPendaftar.jsp">Lihat</a>
            </center>
    </body>
</html>
