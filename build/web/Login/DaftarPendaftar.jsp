<%-- 
    Document   : DaftarPendaftar
    Created on : Dec 30, 2019, 8:11:51 PM
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
    <%@page import="mong.Pendaftaran" %>
    <jsp:useBean id="sup" class="mong.Pendaftaran"/>
    <jsp:useBean id="sup1" class="mong.PendaftaranFacade"/>
    <%
    Pendaftaran[] dataPendaftaran = sup1.getDataPendaftaran();
    
    %>
    <body>
    <center>
        <h1>Daftar Pendaftar</h1>
        <hr/>
        <table border="1">
            <tr>
                <td>ID Pendaftar</td>
                <td>Nama Pendaftar</td>
                <td>Jenis Kelamin</td>
                <td>No Handpone</td>
                <td>Alamat</td>
                <td>Username</td>
                <td>Password</td>
                <td>Aksi</td>
            </tr>
            <%
                for(int i=0;i<dataPendaftaran.length;i++){
                    sup = dataPendaftaran[i];%>
            <tr>
                <td><%=sup.getId()%></td>
                <td><%=sup.getNamaPendaftar()%></td>
                <td><%=sup.getJkPendaftar()%></td>
                <td><%=sup.getNohpPendaftar()%></td>
                <td><%=sup.getAlamat()%></td>
                <td><%=sup.getUsername()%></td>
                <td><%=sup.getPassword()%></td>
                <td align="center"><a href=FormEditPendaftaran.jsp?idpen=<%=sup.getId()%>>Edit</a> | <a href=../HapusPendaftar?idpen=<%=sup.getId()%>>Delete</a></td>
            </tr>        
                    <%
                }%>
        
        </table>
       </center>
    </body>
    <jsp:include page="../Bingkai/Footer.html"></jsp:include>
</html>


