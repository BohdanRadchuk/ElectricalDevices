package com.trainings;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/hello") - example with annotations
public class HelloWeb extends HttpServlet {
    private static final String URL = "index.jsp";
    private static final String GET_MESSAGE = "This is message from servlet";
    private static final String ATTRIBUTE_NAME = "message";
    private static final String POST_PARAMETER = "inputMessage";
    private String message;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        message = GET_MESSAGE;
        req.setAttribute(ATTRIBUTE_NAME, message);
        req.getRequestDispatcher(URL).forward(req, resp);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        message = req.getParameter(POST_PARAMETER);
        req.setAttribute(ATTRIBUTE_NAME, message);
        req.getRequestDispatcher(URL).forward(req, resp);
    }

}
