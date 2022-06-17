<%-- 
    Document   : index
    Created on : 15 feb 2022, 19:04:35
    Author     : Alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<title>Formulario Login</title>
</head>
<body>
    <h1>Agregar un cliente</h1><!<!-- Este es el jsp principal cuando inicia el programa -->
<s:form action="Agregar_cliente" method="post"><!--Creamos un formulario,los métodos vienen de la clase Agregar_cliente-->
    <s:textfield name="Identificador" label="Identificador"/><!-- Campo del nombre de usuario -->
<s:password name="Contrasena" label="Contrasena"/><!-- Campo de la contraseña -->
<s:submit label="Agregar Cliente"/><!--Botón para enviar los datos.-->
</s:form>
</body>
</html>
