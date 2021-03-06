<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Registro</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%@include file="cabecera.jsp" %>
        <h2>Registro</h2>
        <form name="form" method="post" action="clientes.do">
            <label> Nombre:</label>
            <input id="nombre" name="nombre" type="text" 
                   required="required" size="50" maxlength="50"/>
            <br/>
            <label> Email:</label>
            <input id="email" name="email" type="email" 
                   required="required" size="50" maxlength="250"/>
            <br/>
            <label> Edad:</label>
            <input id="edad" name="edad" type="number" 
                   required="required" size="50" max="200" min="1"/>
            <br/>
            <label> Activo:</label>
            <input id="activo" name="activo" type="checkbox" 
                   required="required" checked="checked"/>
            <br/>
            <label> Password:</label>
            <input id="password" name="password" type="password" 
                   required="required" size="50" maxlength="50"/>
            <br/>
            <input type="reset" value="Limpiar"/>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
