/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimpl;

import dao.validarfuncion;
import funcion.estado;

/**
 *
 * @author NEVADA
 */
public class validarfuncionimpl implements validarfuncion{

    @Override
    public estado validarestado(int valor1, int valor2) {
        estado ts=null;
         valor1=+valor1;
         valor2=+valor2;
         return ts;
    }
    
}
