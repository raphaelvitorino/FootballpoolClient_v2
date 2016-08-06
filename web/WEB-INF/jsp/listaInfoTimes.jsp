<%-- 
    Document   : listaInfoTimes
    Created on : 05/08/2016, 20:30:52
    Author     : raphael.silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${teamInfo.SName}</h1>
        <p>Zagueiros</p>
        <c:forEach items="${defenders}" var="defender">
            <ul>
                <li>${defender}</li>
            </ul>
        </c:forEach>
    </body>
</html>
