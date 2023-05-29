import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.blue);
        setLayout(null);
        
        JLabel heading = new JLabel("WELCOME  " + name + " to simple but brilliant" );
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner hand ITC",Font.BOLD,20));
        heading.setForeground(Color.white);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("TAHOMA",Font.ITALIC,20));
        rules.setForeground(Color.white);
        rules.setText(
                "<html>"+
                "1. The test contains 10 questions." +"<br><br>"+
                "2. There is a 15 sec time limit on each question" + "<br><br>"+
                "3. The test is not official, it's just a nice way to see how much you know, or don't know, about Java." +"<br><br>"+
                "4. Each  question carries 10 mark."+"<br><br>"+
                "5. In order to pass the test you need to score a min of 40 marks."+"<br><br>"+
                 "<html>"   
        );
        add(rules);
        
        start  = new JButton("START");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(Color.white);
        start.setForeground(Color.blue);
        start.addActionListener(this);
        add(start);
        
         back  = new JButton("BACK");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(Color.white );
        back.setForeground(Color.blue);
        back.addActionListener(this);
        add(back);
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent e) {
         if(e.getSource()==back){
             setVisible(true);
             new Login();
         }
         else if(e.getSource()==start){
             setVisible(false);
             new Quiz(name);
         }
     }
    public static void main(String args[]){
        new rules("USER");
    }
}
