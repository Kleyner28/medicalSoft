/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

/**
 *
 * @author estudiante
 */
public class MedicalSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Medico primerMedico =new Medico("Juan","Perez");
        //primerMedico.nombres="Kleyner";        
        System.out.println(primerMedico.getNombres());
        System.out.println(primerMedico.getApellidos());        
        primerMedico.setFecha_nacimiento("28/07/1999");
        Validacion.setCorreo("Kleyner@gmail.com");
        
        System.out.println("El medico es "+primerMedico.getFullName()+" y su edad es: "+primerMedico.getEdad()+"\n"
                + "su correo es "+Validacion.validarEmail());
        Interfaz in1=new Interfaz();        
        in1.Interfaz();
        in1.Interfaz2();
        in1.Interfaz3();
        
    }
    
}
