<%@page import="db.Cuenta_DTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	ArrayList <Cuenta_DTO> cuentas;
	cuentas = (ArrayList<Cuenta_DTO>)request.getAttribute("cuentas");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta Cuentas</title>
</head>
<body>
<h2>Cuentas</h2>
<table border="1">
<tr>
<th>ID</th><th>Nombre</th><th>Valor</th><th>Fecha</th>
</tr>
<%
	for (Cuenta_DTO c : cuentas){%>
		<tr>
		<td><%=c.getId()%></td>
		<td><%=c.getName()%></td>
		<td><%=c.getValor()%></td>
		<td><%=c.getYear()%></td>
		</tr>
	<% }%>
</table>
<br>
<a href="index.jsp">Volver</a>
</body>
</html>