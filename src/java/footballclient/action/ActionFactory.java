/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballclient.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author raphael.silva
 */
public class ActionFactory {
    public static Action getAction(HttpServletRequest request, String defaultAction) 
                throws ServletException {

        String parameter = request.getParameter("action") != null ? request.getParameter("action") : defaultAction;
        String className = "footballclient.action." + parameter;

        try {

            Class<?> clazz = Class.forName(className);
            Action action = (Action) clazz.newInstance();

            return action;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new ServletException("A ActionFactory causou uma exceção", e);
        }
} 
}
