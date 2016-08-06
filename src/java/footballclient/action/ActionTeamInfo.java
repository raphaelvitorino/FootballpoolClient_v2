/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballclient.action;

import eu.dataaccess.footballpool.Info;
import eu.dataaccess.footballpool.InfoSoapType;
import eu.dataaccess.footballpool.TFullTeamInfo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author raphael.silva
 */
public class ActionTeamInfo implements Action {
        @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        InfoSoapType fs = new Info().getInfoSoap();
        String teamName = request.getParameter("selecoes");

        TFullTeamInfo teamInfo = fs.fullTeamInfo(teamName);
        request.setAttribute("teamInfo", teamInfo);
        request.setAttribute("defenders", teamInfo.getSDefenders().getString());
        request.setAttribute("goalKeppers", teamInfo.getSGoalKeepers().getString());
        request.setAttribute("midFields", teamInfo.getSMidFields().toString());

        return "/WEB-INF/jsp/listaInfoTimes.jsp";

    }
}
