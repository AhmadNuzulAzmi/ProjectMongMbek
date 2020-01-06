<%-- 
    Document   : afterDelete
    Created on : Jan 2, 2020, 1:10:16 PM
    Author     : ACER-NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <% String pesan = (String) request.getAttribute("pesan");%>
    <body>
        <%=pesan%>
        <br>
        <a href="Login/DaftarPendaftar.jsp">Melihat Daftar Pendaftar</a>
    </body>
</html>
