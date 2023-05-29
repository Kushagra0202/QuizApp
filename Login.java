/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,485);
        add(image);
        
        JLabel heading = new JLabel("SIMPLE BUT BRILLIANT");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        
        JLabel name = new JLabel("ENTER YOUR NAME");
        name.setBounds(785,150,300,20);
        name.setFont(new Font("Ariel Black",Font.BOLD,18));
        name.setForeground(Color.BLUE);
        add(name);
        
         tfname = new JTextField();
        tfname.setBounds(730,200,300,25);
        tfname.setFont(new Font("Ariel Black",Font.ITALIC,20));
        add(tfname);
        
        
        
         rules  = new JButton("RULES");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.black);
        rules.addActionListener(this);
        add(rules);
        
         back  = new JButton("BACK");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);
        
        
        setSize(1200,500);
        setLocation(100,200);
        setVisible(true);
        
    
    }
    
   public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back){
            setVisible(false);
        }
        else if(e.getSource()==rules){
            String name = tfname.getText();
            setVisible(false);
            new rules(name);
        }
    }
 
    
    public static void main(String args[]){
        new Login();
    }
 
    }
       

   
