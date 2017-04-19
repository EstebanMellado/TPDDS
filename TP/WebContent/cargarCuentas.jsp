<%@page import="db.Cuenta_DTO"%>
<%@page import="db.Cuenta_DAO_impl"%>
<%@page import="db.Cuenta_DAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	ArrayList <Cuenta_DTO> cuentas = new ArrayList <Cuenta_DTO>();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Carga de cuentas</title>
</head>
<body>
<h2>Cuenta</h2>
<form action="${pageContext.request.contextPath}/cargarCuentas" method="get">
<table border="0">
<tr><td>Nombre de cuenta</td><td><input type="text" name="nombre"></td></tr>
<tr><td>Valor de cuenta</td><td><input type="text" name="valor"></td></tr>
<tr><td>Año de cuenta</td><td><input type="text" name="fecha"></td></tr>
</table>
<input type="submit" value="Enviar">
</form>
</body>

</html>