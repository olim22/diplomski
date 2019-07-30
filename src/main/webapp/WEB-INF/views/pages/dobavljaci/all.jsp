<%-- 
    Document   : all
    Created on : 26.07.2019., 13.24.29
    Author     : Olja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dobavljaci</title>
    </head>
    <body>
        <h1>Pregled svih dobavljaca</h1>
        <table class="table table-striped">
            <tr>
                <th>Id</th>
                <th>Naziv dobavljaca</th>
                <th>PIB</th>
                <th>Maticni broj</th>
                <th>Tekuci racun</th>
                <th>Banka</th>
                <th>Grad</th>
            </tr>

            <c:forEach items="${dobavljaci}" var="dobavljac"> 
                <tr>
                    <td>${dobavljac.id}</td>
                    <td>${dobavljac.nazivDobavljaca}</td>
                    <td>${dobavljac.pib}</td>
                    <td>${dobavljac.maticniBroj}</td>
                    <td>${dobavljac.tekuciRacun}</td>
                    <td>${dobavljac.banka}</td>
                    <td>${dobavljac.grad.naziv}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
