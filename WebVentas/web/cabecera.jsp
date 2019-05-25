<%-- 
    Document   : cabecera
    Created on : 24-may-2019, 13:32:37
    Author     : Admin
--%>
<header><h1>Web ventas</h1></header>

<nav>
        <a href="registro.jsp">Nuevo cliente</a>
        <a href="listado.jsp">Listado clientes</a>
        <a href="listado_sql.jsp">Listado JSTL - SQL</a>
        <a href="clientes.do">Listado JSTL y Java Beans</a>
        
        <form method="GET" action="clientes.do">
         <input type="text" id="nombre" name="nombre"/>
         <input type="submit" value="BUSCAR"/>                     
        </form>
        
</nav>