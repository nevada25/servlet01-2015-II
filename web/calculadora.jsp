<%-- 
    Document   : calculadora
    Created on : 04/11/2015, 12:18:16 PM
    Author     : NEVADA
--%>

<%@page import="daoimpl.validarfuncionimpl"%>
<%@page import="funcion.estado"%>
<%@page import="dao.validarfuncion"%>
<%@page import="com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CALCULADORA</title>
        <link type="text/css" rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="jquery/jquery-2.1.4.min.js"></script>   
        <link rel="shortcut icon"  href="1446680681_calculator.ico" />
        <style>
            input.form-control{
                margin: 12PX;
            }
			input{
				width:80px;
				height:40px;
				margin:10px;
				padding:10px;
				
				}
                                img{
                                    margin: 0px;
                                    height: 50px;
                                        width: 50px;
                                }
				
                                button{
                                    background: none;
                                    border: none;
                                    
                                    
                                }
                                #resplandorblanco{ 
                                    -moz-box-shadow: 0px 0px 15px #000; 
                                    -webkit-box-shadow: 0px 0px 15px #000; 
                                     box-shadow: 0px 0px 15px #000;
        </style>
    </head>
    <body>
        <%--
         String valo1="0";   
         valo1=request.getParameter("valor1");
        
        if(valo1==null || valo1.equals("")){
            %>
            
            <script>
            alert("EL PRIMER VALOR ESTA VACIO");
            </script>
            <%
        }
        --%>
    <div class="col-lg-12 modal-body">
      <div  class="col-lg-4"></div>
    
      <div class="col-lg-4" style="margin: 50PX;   background: url(fondo.png);  border-radius: 0.5em; color: #204d74;" id="resplandorblanco">
       <div class="col-lg-12" style="margin: 10px;     margin-right: 10px;" >
      <center>
          <h1><b>CALCULADORA</b></h1>
        </center>
        
      </div>
        <center>
                
            <form method="POST" action="funcionesSVT" style="margin:10px; margin-right: 10px;">
                <table>
  <tbody>
    <tr>
  <div  ><input type="number" class="form-control" name="valor1" placeholder="INGRESE VALOR 1"  required class/></div>
    </tr>
    <tr>
  <div><input type="number" class="form-control" name="valor2" placeholder="INGRESE VALOR 2" required class/></div>
    </tr>
    <tr>
        <center>
    <td class="col-lg-2" colspan="2">
       <div align="center" style="margin:15px;">
         <button type="submit"  name="calcular" value="1"><img src="suma.ico"></button>
         <button type="submit" name="calcular" value="2"><img src="resta.ico"></button>
         <button type="submit" name="calcular" value="3"><img src="mul.ico"></button>
         <button type="submit" name="calcular" value="4"><img src="division.ico"></button>
         <button type="reset" name="calcular" value="4"><img src="limp.ico"></button>
        </div>
       
    </td>
    </center>
    </tr>
  </tbody>
</table>
</form> 
            </center>
        </div>
        <div  class="col-lg-4"></div>
        </div>

    </body>
</html>
