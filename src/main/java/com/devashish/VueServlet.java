package com.devashish;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/vue")
public class VueServlet extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    RequestDispatcher rd = req.getRequestDispatcher("vue.html");
    rd.forward(req, res);
  }
}
