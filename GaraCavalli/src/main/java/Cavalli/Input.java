/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cavalli;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author informatica
 */
public class Input extends JFrame implements ActionListener
{
    private Container c = new Container();
    private int corsie;
    private JPanel pannello = new JPanel();
    private JTextField inputTesto = new JTextField();
    private JLabel testo = new JLabel("Inserire Corsie");
    private JButton bottone = new JButton("VIA");
    
    public Input()
    {
       c = this.getContentPane();
       pannello.setLayout(null);
       this.setSize(400, 300);
       this.setTitle("Corsa");
       this.setVisible(true);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       testo.setBounds(135, 20, 300, 20);
       inputTesto.setBounds(125, 60, 140, 20);
       bottone.setBounds(140, 100, 90, 20);
       
       pannello.add(testo);
       pannello.add(inputTesto);
       pannello.add(bottone);
       c.add(pannello);
       
       bottone.addActionListener(this);
       
       
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String evento = e.getActionCommand();
        String corsie = "";
        int c = 0;
        
        switch(evento)
        {
            case "VIA":
                corsie = inputTesto.getText();
                c = Integer.valueOf(corsie);
                
                if(c >= 2 && c <= 12)
                {
                    GaraCavalliGrafica f = new GaraCavalliGrafica(c);
                }
                
        }
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
