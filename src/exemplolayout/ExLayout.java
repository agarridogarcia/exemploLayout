/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplolayout;


import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author agarridogarcia
 */
public class ExLayout {
    public void amosarVentana(){
        JFrame marco=new JFrame("***LAYOUTS***");
        marco.setSize(400,400);
        marco.setVisible(true);
        JPanel panel=new JPanel();
        JButton bot1=new JButton("boton 1");
        JButton bot2=new JButton("boton 2");
        JButton bot3=new JButton("boton 3");
        FlowLayout des=new FlowLayout(FlowLayout.CENTER);
        panel.setLayout(des);
       
        panel.add(bot3);
        panel.add(bot2);
        panel.add(bot1);
        
//        marco.add(panel);
//        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 panel.setLayout(new FlowLayout(FlowLayout.RIGHT,10,15));//sustitue as lineas comentadas arriba
        
        
        
     
        
    }
    
}
