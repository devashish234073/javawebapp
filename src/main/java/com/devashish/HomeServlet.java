package com.devashish;

import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  
import javax.servlet.annotation.WebServlet;

@WebServlet("/home")
public class HomeServlet extends HttpServlet{  
  public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
  {  
    res.setContentType("text/html");//setting the content type  
    PrintWriter pw=res.getWriter();//get the stream to write the data  
  
    //writing html in the stream  
    pw.println("<html><body>");  
    pw.println("<link rel='stylesheet' type='text/css' href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css'/>");
    pw.println("<p class='display-1'>You are in the home</p><br>");
    pw.println("<input type='button' class='btn btn-primary' value='Ok'>");  
    pw.println("</body></html>");  
  
    pw.close();//closing the stream  
  }
}  
