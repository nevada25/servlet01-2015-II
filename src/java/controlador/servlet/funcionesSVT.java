/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.servlet;

import dao.validarfuncion;
import daoimpl.validarfuncionimpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NEVADA
 */
public class funcionesSVT extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int calcular=Integer.parseInt(request.getParameter("calcular")); 
            switch(calcular)
            {
            case 1:
            int valor1=Integer.parseInt(request.getParameter("valor1"));
            int valor2=Integer.parseInt(request.getParameter("valor2")); 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println(" <link rel='shortcut icon'  href='suma.ico'/>");
            out.println("<title>SUMA</title>");  
            out.println("<style> #resplandorblanco{ -moz-box-shadow: 0px 0px 15px #000; -webkit-box-shadow: 0px 0px 15px #000; \n" +
"      box-shadow: 0px 0px 15px #000;</style>");  
            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='col-lg-4'></div>");
            out.println("<div class='col-lg-4'>");
            out.println("<center>");
            out.println("<table id='resplandorblanco' style='margin: 90PX;  padding: 20px; font-size: 25px;  background: url(fondo.png);  border-radius: 0.5em; color: #204d74;'>");
            out.println("<tbody>");
            out.println("<tr>");
            out.println("<td colspan='5'>");
            out.println("<h1><center>SUMA</center></h1>");
            out.println("</td>");
            out.println("<tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<h1><b>"+valor1+"</b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b><center>+</center></b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b>"+valor2+"</b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b><center>=</center></b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b>"+(valor1+valor2)+"</b></h1>");
               out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan='5'style=' margin: 0px; width:15px; height: 15px;'>");
            out.println("<h4><center><a href='calculadora.jsp'><button style=' margin: 0px; background: none; border: none;'><img src='retorna.ico'></button></a></center></h4>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tbody>");
            out.println("<table>");
            out.println("</center>");
            out.println("</div>");
            out.println("<div class='col-lg-4'></div>");
            out.println("</body>");
            out.println("</html>");
        
             
            break;
            case 2:
            int valor3=Integer.parseInt(request.getParameter("valor1"));
            int valor4=Integer.parseInt(request.getParameter("valor2"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>RESTA</title>");      
             out.println(" <link rel='shortcut icon'  href='resta.ico'/>");
            out.println("<style> #resplandorblanco{ -moz-box-shadow: 0px 0px 15px #000; -webkit-box-shadow: 0px 0px 15px #000; \n" +
"      box-shadow: 0px 0px 15px #000;</style>");  
            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='col-lg-4'></div>");
            out.println("<div class='col-lg-4'>");
            out.println("<center>");
            out.println("<table id='resplandorblanco' style='margin: 90PX;  padding: 20px; font-size: 25px;  background: url(fondo.png);  border-radius: 0.5em; color: #204d74;'>");
            out.println("<tbody>");
            out.println("<tr>");
            out.println("<td colspan='5'>");
            out.println("<h1><center>RESTA</center></h1>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<h1><b>"+valor3+"</b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b><center>-</center></b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b>"+valor4+"</b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b><center>=</center></b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b>"+(valor3-valor4)+"</b></h1>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan='5'style=' margin: 0px; width:15px; height: 15px;'>");
            out.println("<h4><center><a href='calculadora.jsp'><button style=' margin: 0px; background: none; border: none;'><img src='retorna.ico'></button></a></center></h4>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tbody>");
            out.println("<table>");
            out.println("</center>");
            out.println("</div>");
            out.println("<div class='col-lg-4'></div>");
            out.println("</body>");
            out.println("</html>");
            break;
                case 3:
                    int valor5=Integer.parseInt(request.getParameter("valor1"));
            int valor6=Integer.parseInt(request.getParameter("valor2"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>RESTA</title>");      
             out.println(" <link rel='shortcut icon'  href='resta.ico'/>");
            out.println("<style> #resplandorblanco{ -moz-box-shadow: 0px 0px 15px #000; -webkit-box-shadow: 0px 0px 15px #000; \n" +
"      box-shadow: 0px 0px 15px #000;</style>");  
            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='col-lg-4'></div>");
            out.println("<div class='col-lg-4'>");
            out.println("<center>");
            out.println("<table id='resplandorblanco' style='margin: 90PX;  padding: 20px; font-size: 25px;  background: url(fondo.png);  border-radius: 0.5em; color: #204d74;'>");
            out.println("<tbody>");
            out.println("<tr>");
            out.println("<td colspan='5'>");
            out.println("<h1><center>MULTIPLICAC&Oacute;N</center></h1>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<h1><b>"+valor5+"</b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b><center>x</center></b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b>"+valor6+"</b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b><center>=</center></b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b>"+(valor5*valor6)+"</b></h1>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan='5'style=' margin: 0px; width:15px; height: 15px;'>");
            out.println("<h4><center><a href='calculadora.jsp'><button style=' margin: 0px; background: none; border: none;'><img src='retorna.ico'></button></a></center></h4>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tbody>");
            out.println("<table>");
            out.println("</center>");
            out.println("</div>");
            out.println("<div class='col-lg-4'></div>");
            out.println("</body>");
            out.println("</html>");
                break;
            case 4:
            double valor7=Integer.parseInt(request.getParameter("valor1"));
            double valor8=Integer.parseInt(request.getParameter("valor2"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>MULTIPLICA&Oacute;N</title>");            
            out.println(" <link rel='shortcut icon'  href='resta.ico'/>");
            out.println("<style> #resplandorblanco{ -moz-box-shadow: 0px 0px 15px #000; -webkit-box-shadow: 0px 0px 15px #000; \n" +
"      box-shadow: 0px 0px 15px #000;</style>");  
            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='col-lg-4'></div>");
            out.println("<div class='col-lg-4'>");
            out.println("<center>");
            out.println("<table id='resplandorblanco' style='margin: 90PX;  padding: 20px; font-size: 25px;  background: url(fondo.png);  border-radius: 0.5em; color: #204d74;'>");
            out.println("<tbody>");
            out.println("<tr>");
            out.println("<td colspan='5'>");
            out.println("<h1><center>DIVISI&Oacute;N</center></h1>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<h1><b>"+valor7+"</b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b><center>/</center></b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b>"+valor8+"</b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b><center>=</center></b></h1>");
            out.println("</td>");
            out.println("<td>");
            out.println("<h1><b>"+(valor7/valor8)+"</b></h1>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan='5'style=' margin: 0px; width:15px; height: 15px;'>");
            out.println("<h4><center><a href='calculadora.jsp'><button style=' margin: 0px; background: none; border: none;'><img src='retorna.ico'></button></a></center></h4>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tbody>");
            out.println("<table>");
            out.println("</center>");
            out.println("</div>");
            out.println("<div class='col-lg-4'></div>");
            out.println("</body>");
            out.println("</html>");
            break;
        }
        }
        }
        
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

