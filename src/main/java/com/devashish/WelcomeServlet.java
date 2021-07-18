package com.devashish;

import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  
import javax.servlet.annotation.WebServlet;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet{  
  public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
  {  
    res.setContentType("text/html");//setting the content type  
    PrintWriter pw=res.getWriter();//get the stream to write the data  
  
    //writing html in the stream  
    pw.println("<html><body>");  
    pw.println("<link rel='stylesheet' type='text/css' href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css'/>");
    pw.println("<p class='display-2'>This is welcome page</p>");  
    pw.println("</body></html>");  
  
    pw.close();//closing the stream  
  }
}  
