<%-- 
    Document   : index
    Created on : 24.07.2019., 14.03.40
    Author     : Olja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
    <form:form method="POST" action="/diplomski/login" modelAttribute="sluzbenik">
        <fieldset>
            <legend>Login</legend>
            ${error}
            <table>
                <tr>
                    <td><form:label path="username">Username:</form:label></td>
                <td><form:input path="username"/><form:errors path="username" /></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password:</form:label></td>
                    <td><form:password path="password"/><form:errors path="password" /></td>
                </tr>
                <tr><td colspan="2" align="center">
                        <button id="login">Login</button>
                    </td></tr>
            </table>
        </fieldset>
    </form:form>
</body>
</html>
