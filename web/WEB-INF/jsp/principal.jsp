<%-- 
    Document   : principal
    Created on : 03/08/2016, 20:59:29
    Author     : raphael.silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Estatísticas de Futebol</title>
  </head>
  <body>
      
    <h1>Estatísticas da Euro 2016</h1>
    <form action="controller?action=ActionTeamInfo" method="POST">
        <label for="selecoes">Escolha uma seleção: </label>
            <select name="selecoes">
              <c:forEach items="${teams}" var="team">
                  <option>${team.SName}</option>
              </c:forEach>
            </select> 
        <input type="submit" value="Gravar">
    </form>
  </body>
</html>
