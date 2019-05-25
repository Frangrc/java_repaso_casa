<%-- 
    Document   : listado_sql
    Created on : 24-may-2019, 12:28:00
    Author     : Admin
--%>

<%@page import="com.sinensia.modelo.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*,java.sql.*" %>
<%@page import="javax.servlet.http.*,javax.servlet.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado con JSTL</title>
    </head>
    <body>
        <%@include file="cabecera.jsp" %>
        <h2>Listado clientes con SQL</h2>
        <table border="2">           
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Email</th>                  
                </tr>
            </thead>
            <%--Formato JSTL no tan cutre--%>
           <%--Cogemos el driver del mysql--%>
           <sql:setDataSource var="fuenteSQL" driver="com.mysql.cj.jdbc.Driver"
                               url="jdbc:mysql://localhost:3306/bd_ventas?user=admin&password=Admin1234&userSSL=false&serverTimezone=UTC" 
                               user="admin" password="Admin1234"/> 
            <sql:query dataSource="${fuenteSQL}" var="resultado">  
                SELECT id, nombre, edad, email, password, activo FROM cliente
            </sql:query>
            <c:forEach var="fila" items="${resultado.rows}">
                <tr>
                    <%-- Cada uno de los campos en BBDD --%>
                    <td> <c:out value="${fila.nombre}"/></td>
                    <td> <c:out value="${fila.email}"/></td>
                </tr>
            </c:forEach>
                
         <table/>
               
    </body>
</html>
