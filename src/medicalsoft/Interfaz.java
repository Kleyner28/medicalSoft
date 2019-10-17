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
import java.awt.Container;
import javax.swing.*;

public class Interfaz extends JFrame{                                            
    
    public Interfaz(){        
        super("HOSPITAL");                       
        this.addcomponent();
    }    
    
    public void config(){
        this.setSize(300, 300);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);    
    }
    
    public void addcomponent(){
        this.config();
                
        Container panel=this.getContentPane();
        
        GroupLayout gl=new GroupLayout(panel);
        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);
        panel.setLayout(gl);
        
        JLabel b1=new JLabel("Nombre");
        JTextField b2=new JTextField();
        JLabel b3=new JLabel("Apellido");
        JTextField b4=new JTextField();
        
        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(b1).addComponent(b3))
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(b2).addComponent(b4)));
        
        gl.setVerticalGroup(gl.createSequentialGroup()
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(b1).addComponent(b2))
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(b3).addComponent(b4)));               
    
    }
        
    }
    

    

