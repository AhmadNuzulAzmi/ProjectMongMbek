<%-- 
    Document   : FormEditPendaftaran
    Created on : Dec 30, 2019, 9:09:18 PM
    Author     : ACER-NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<jsp:useBean id="pen" class="mong.Pendaftaran"/>
<jsp:useBean id="pen1" class="mong.PendaftaranFacade"/>
<%
    String IdPen = request.getParameter("idpen");
    if(IdPen != null){
        pen = pen1.getDataPendaftaranById(IdPen);
    
%>
<!DOCTYPE html>
<html>
    <jsp:include page="../Bingkai/header.html"></jsp:include>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="../EditPendaftaran" method="post">
    <center>
        <h1 align="center"> Berhasil Ditambahkan </h1>
      <hr/>
        <table>
            <tr>
                <td>ID Pendaftar</td>
                <td>:</td>
                <td><%=pen.getId()%></td>
            </tr> 
            <input type="text" name="id" value=<%=pen.getId()%>>
            <tr>
                <td>Nama Pendaftar</td>
                <td>:</td>
                <td><input type="text" name="nama" value=<%=pen.getNamaPendaftar()%>></td>
            </tr>
            <tr>
                <td>Jenis Kelamin</td>
                <td>:</td>
                <td><select name="jk">
                        <option value="Laki-laki">Laki-laki</option>
                        <option value="Perempuan"> Perempuan </option>
                        </select></td>
            </tr>
            <tr>
                <td>No Hp Pendaftar</td>
                <td>:</td>
                <td><input type="text" name="nohp" value=<%=pen.getNohpPendaftar()%>></td>
            </tr>
            <tr>
                <td>Alamat Pendaftar</td>
                <td>:</td>
                <td><input type="text" name="alamat" value=<%=pen.getAlamat()%>></td>
            </tr>
            <tr>
                <td>Username</td>
                <td>:</td>
                <td><input type="text" name="username" value=<%=pen.getUsername()%>></td>
            </tr>
            <tr>
                <td>Password</td>
                <td>:</td>
                <td><input type="text" name="password" value=<%=pen.getPassword()%>></td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="Kirim">
                    <input type="reset" value="Reset">
                </td>
            </tr>
            <% } %>
            
        </table>
            </center>
        </form>
    </body>
    <jsp:include page="../Bingkai/Footer.html"></jsp:include>
</html>


