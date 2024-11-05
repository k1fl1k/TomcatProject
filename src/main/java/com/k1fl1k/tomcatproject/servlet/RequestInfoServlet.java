package com.k1fl1k.tomcatproject.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/request-info")
public class RequestInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
        out.println("<h2>Request Information</h2>");
        out.println("<p>Request Method: " + req.getMethod() + "</p>");
        out.println("<p>Request URI: " + req.getRequestURI() + "</p>");
        out.println("<p>Request Protocol: " + req.getProtocol() + "</p>");
        out.println("<p>Remote Address: " + req.getRemoteAddr() + "</p>");
        out.println("<p>Remote Host: " + req.getRemoteHost() + "</p>");
        out.println("<p>Remote Port: " + req.getRemotePort() + "</p>");

        // List all parameters
        out.println("<h3>Request Parameters</h3>");
        req.getParameterMap().forEach((key, value) -> {
            out.println("<p>" + key + ": " + String.join(", ", value) + "</p>");
        });

        out.println("</body></html>");
    }
}

