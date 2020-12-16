package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * listens for username on login.
 */
public class PreAuthenticationRequestListener implements ServletRequestListener {

    public static final String USERNAME_KEY = "USERNAME";

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
        if (request.getRequestURI().contains("j_security_check")) {
            final String username = request.getParameter("j_username");

            HttpSession session = request.getSession();
            session.setAttribute(USERNAME_KEY, username);
        }
    }
}