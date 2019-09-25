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
import java.awt.*;

public class Interfaz extends JFrame{
    
    private JLabel label1=new JLabel();
    private JTextField tex=new JTextField();
    
    public void Interfaz(){
        JFrame fr1=new JFrame("HOSPITAL");
        fr1.setSize(300, 300);
        fr1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fr1.setLocationRelativeTo(null);
        fr1.setVisible(true);
        Container cp=getContentPane();
        cp.setLayout(new FlowLayout());
        
    }

    public void Interfaz2(){
        JFrame fr2=new JFrame("PACIENTE");
        fr2.setSize(300, 300);
        fr2.setDefaultCloseOperation(EXIT_ON_CLOSE);    
        fr2.setVisible(true);
    }

    public void Interfaz3(){
        JFrame fr3=new JFrame("MEDICO");
        fr3.setSize(300, 300);
        fr3.setDefaultCloseOperation(EXIT_ON_CLOSE);         
        fr3.setVisible(true);
    }

    
}
