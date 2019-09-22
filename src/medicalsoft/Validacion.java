/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author estudiante
 */
public class Validacion {   
    
    public static String correo;

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        Validacion.correo = correo;
    }
    
    public static String validarEmail(){           
    
    Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); 
 
        Matcher mather = pattern.matcher(correo);
        
        if (mather.find() == true) {
            System.out.println("El email ingresado es válido.");
        } else {
            System.out.println("El email ingresado es inválido.");
        }
    
    return correo;
    }
    
}
