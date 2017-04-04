/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplolayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author agarridogarcia
 */
public class ExBorderLayout {
       public void amosarVentana(){
        JFrame marco=new JFrame("***LAYOUTS***");
        marco.setSize(400,400);
        marco.setVisible(true);
        JPanel panel=new JPanel();
        JButton bot1=new JButton("boton 1");
        JButton bot2=new JButton("boton 2");
        JButton bot3=new JButton("boton 3");
        JButton bot4=new JButton("boton 3");
        JButton bot5=new JButton("boton 3");

         panel.setLayout(new FlowLayout(FlowLayout.RIGHT,10,15));//sustitue as lineas comentadas arriba
         
         panel.setLayout(new BorderLayout());
         panel.add(bot1, BorderLayout.NORTH);
         panel.add(bot2, BorderLayout.SOUTH);
         panel.add(bot3, BorderLayout.CENTER);
         panel.add(bot4, BorderLayout.EAST);
         panel.add(bot5, BorderLayout.WEST);
         marco.add(panel);
         marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
}
}
