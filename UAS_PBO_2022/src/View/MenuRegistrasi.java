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
public class MenuRegistrasi {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    JLabel labelNIK = new JLabel("NIK:");
    JTextField nik = new JTextField();
    JLabel labelNama = new JLabel("Nama:");
    JTextField nama = new JTextField();
    JLabel labelTempatLahir = new JLabel("Tempat Lahir:");
    JTextField tempatLahir = new JTextField();
    
    public MenuRegistrasi(){
        
    }
}
