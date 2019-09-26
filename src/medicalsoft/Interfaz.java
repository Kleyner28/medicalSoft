/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsoft;

/**
 *
 * @author User
 */
import javax.swing.*;

public class Interfaz extends JFrame{            
    
    public int getBounds(int x,int y){
        x=Integer.parseInt(JOptionPane.showInputDialog("Digita x"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Digita y"));                
    return x&y;
    }
            
    public void Interfaz(){
        
        JFrame fr1=new JFrame("HOSPITAL");
        fr1.setSize(300,300);
        fr1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fr1.setLocationRelativeTo(null);        
        fr1.setVisible(true);                   
        fr1.setLayout(null);
        int nlabel = Integer.parseInt(JOptionPane.showInputDialog("Numero de etiquetas"));
        String eti[]= new String[nlabel];        
        for (int i = 0; i < nlabel; i++) {
            eti[i]=JOptionPane.showInputDialog("Digite el nombre de la etiqueta en la posicion ["+i+"]");                       
            for (int j = 0; j < nlabel; j++) {                            
            }      
            System.out.println(eti[i]);
            fr1.add(new JLabel(eti[i]));                                  
        }      
        
    }

    public void Interfaz2(){
        JFrame fr2=new JFrame("PACIENTE");
        fr2.setSize(300, 300);
        fr2.setDefaultCloseOperation(EXIT_ON_CLOSE);    
        fr2.setVisible(true);  
        fr2.setLayout(null);
        JLabel label=new JLabel("Hola");
        label.setBounds(20, 10, 40, 20);
        fr2.add(label);
    }

    public void Interfaz3(){
        JFrame fr3=new JFrame("MEDICO");
        fr3.setSize(300, 300);
        fr3.setDefaultCloseOperation(EXIT_ON_CLOSE);         
        fr3.setVisible(true);
    }

    
}
