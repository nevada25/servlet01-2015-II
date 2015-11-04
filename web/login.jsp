<%-- 
    Document   : login
    Created on : 04/11/2015, 10:24:41 AM
    Author     : NEVADA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="jquery/jquery-2.1.4.min.js" ></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-lg-5">
        <form method="POST" action="validarusuarioSVT">
            <table>
                <tr> 
                    <td><label >USUARIO</label></td>
                    <td><input class="form-control" type="text" name="username" size="20" placeholder="USUARIO"></td>
                </tr>
                
                 <tr> 
                     <td><label>CONTRASE&Ntilde;A</label></td>
                     <td><input type="password" class="form-control" name="clave" size="20" placeholder="CONTRASE&Ntilde;A"></td>
                </tr>
                <tr>
                <center>
                    <td><input type="submit" class="form-control info" value="INICIAR SESI&Oacute;N"  /></td>
                </center>
                </tr>
                
            </table>
        </form>
        </div>
        <div class="col-lg-7"></div>
    </body>
</html>
