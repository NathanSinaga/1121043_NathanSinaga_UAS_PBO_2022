/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nathan Sinaga
 */
public class MenuLogin {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel labelEmail = new JLabel("Email:");
    JTextField email = new JTextField();
    JLabel labelPassoword = new JLabel("Nama:");
    JTextField password = new JTextField();
    
    public MenuLogin(){
        frame.setSize(500, 150);

        frame.add(panel);
        panel.setLayout(null);
        frame.setTitle("Menu Log In");
        
        labelEmail.setBounds(10, 20, 120, 25);
        panel.add(labelEmail);
        email.setBounds(140, 20, 250, 25);
        panel.add(email);
        labelPassoword.setBounds(10, 50, 120, 25);
        panel.add(labelPassoword);
        password.setBounds(140, 50, 250, 25);
        panel.add(password);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
