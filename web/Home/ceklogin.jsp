<%-- 
    Document   : ceklogin
    Created on : Dec 28, 2019, 1:12:15 PM
    Author     : ACER-NITRO
--%>

<%@page import ="java.sql.DriverManager" %>
<%@page import ="java.sql.Connection" %>
<%@page import ="java.sql.Statement" %>
<%@page import ="java.sql.ResultSet" %>
<%@page import ="java.sql.SQLException" %>
<%@page import ="java.util.ArrayList" %>
<%
    String userid = request.getParameter("username");    
    String pwd = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mongmbek","root","");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from pendaftaran where username='" + userid + "' and password='" + pwd + "'");
    if (rs.next()) {
        response.sendRedirect("Home1.jsp");
    } else {
//        out.println("welcome " + userid);
//        out.println("password " + pwd);
        out.println("Invalid password <a href='../Home/Home.jsp'>try again</a>");
    }
%>