<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%int cod = (int)request.getAttribute("codId"); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmacion carga de cuentas</title>
</head>
<body>
<%if(cod == 0){ %>
	Las cuentas fueron cargadas exitosamente!
<%}else{ %>
	Ocurrio un error al cargar las cuentas en el archivo<br>
	Codigo de error: <%=cod%>
<%}%>
<br>
<a href="index.jsp">Volver</a>
</body>
</html>