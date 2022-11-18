/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Nathan Sinaga
 */
public class MenuUtama {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton menuLogin = new JButton("Menu Log In");
    JButton menuRegistrasi = new JButton("Menu Registrasi");
    JButton menuShowAll = new JButton("Menu Show All");
    
    public MenuUtama(){
        frame.setSize(500, 500);
        menuLogin.setBounds(10, 20, 1200, 25);
//        menuLogin.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new MenuLogin();
//            }
//        });
        panel.add(menuLogin);
        menuRegistrasi.setBounds(10, 50, 120, 25);
//        menuRegistrasiaddActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new MenuRegistrasi();
//            }
//        });
        panel.add(menuRegistrasi);
        menuShowAll.setBounds(10, 75, 120, 25);
//        menuShowAll.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new MenuTunjukanSemuaPengguna();
//            }
//        });
        panel.add(menuShowAll);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
