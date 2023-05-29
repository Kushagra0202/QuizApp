
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Score extends JFrame implements ActionListener{
  static  String name;
   static  int marks;
   JButton PG;
    
    Score(String name, int marks){
        this.name=name;
        this.marks=marks;
        
         this.name=name;
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,350);
        add(image);
        
        JLabel heading = new JLabel("THANK YOU "+ name.toUpperCase()+" FOR PLAYING");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("ITALIC",Font.PLAIN,26));
        heading.setForeground(Color.red);
        add(heading);
        
        
        JLabel score = new JLabel("YOUR SCORE IS "+ marks);
        score.setBounds(350, 200, 300, 30);
        score.setFont(new Font("ITALIC",Font.PLAIN,26));
        score.setForeground(Color.red);
        add(score);
        
         PG = new JButton("PLAY AGAIN");
        PG.setBounds(390,270,120,30);
        PG.setBackground(Color.WHITE);
        PG.setForeground(Color.blue);
        PG.addActionListener(this);
        add(PG);
        
        
        
         setVisible(true);
        
        
        
 
         
    }
    public void actionPerformed(ActionEvent e) {
             if(e.getSource()==PG){
                 setVisible(false);
                 new Login();
             }
         }
    public static void main(String args[]){
        new Score("user",0);
    }
}
