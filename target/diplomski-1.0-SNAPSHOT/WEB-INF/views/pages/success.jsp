<%-- 
    Document   : success
    Created on : 24.07.2019., 15.30.00
    Author     : Olja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page - Success</title>
    </head>
    <body>
        <h1>Hello ${sessionScope.username}!</h1>
        <br>
        <a href="${pageContext.request.contextPath}/dobavljaci/all">Dobavljaci</a>
        <br>
        <a href="${pageContext.request.contextPath}/logout">Logout</a>
    </body>
</html>
