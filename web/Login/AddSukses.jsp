<%-- 
    Document   : AddSukses
    Created on : Dec 28, 2019, 7:09:04 PM
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
    <jsp:useBean id="sup" class="mong.Pendaftaran"/>
    <%
      sup = (mong.Pendaftaran)request.getAttribute("dataPen");
    %>
    <body>
        <h1 align="center"> Berhasil Ditambahkan </h1>
<!--        <hr/>
        <table>
            <tr>
                <td>Id Pendaftar</td>
                <td>:</td>
                <td><%=sup.getId()%></td>
            </tr>
            <tr>
                <td>Nama Pendaftar</td>
                <td>:</td>
                <td><%=sup.getNamaPendaftar()%></td>
            </tr>
            <tr>
                <td>JK Pendaftar</td>
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
            <b>Berhasil</b>Ditambahkan, <a href="DaftarSupplier.jsp">Lihat</a>-->
    </body>
    <jsp:include page="../Bingkai/Footer.html"></jsp:include>
</html>
