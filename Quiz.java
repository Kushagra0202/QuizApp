
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Quiz extends JFrame implements ActionListener  {
    
    String questions[][] = new String[10][5];
    String answers[][]=new String[10][2];
    String uanswers[][] = new String[10][1];
    JLabel qno,Question;
    JRadioButton bt1,bt2,bt3,bt4;
    JButton next,submit,lifeline;
    public static int timer = 15;
    public static int ans_given=0;
    ButtonGroup group;
    public static int count=0;
    public static int marks=0;
    static String name;
    Quiz(String name){
        this.name=name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1400,390);
        add(image);
        
         qno = new JLabel();
        qno.setBounds(50, 400, 50, 50);
        qno.setFont(new Font("Ariel Black",Font.BOLD,20));
        add(qno);
        
         Question = new JLabel();
        Question.setBounds(100, 400, 1000, 50);
        Question.setFont(new Font("Ariel Black",Font.BOLD,20));
        add(Question);
        
        questions[0][0]="Number of primitive data types in Java are?";
        questions[0][1]="6";
        questions[0][2]="8";
        questions[0][3]="7";
        questions[0][4]="5";
        
        questions[1][0]="What is the size of float and double in java?";
        questions[1][1]="32 AND 32";
        questions[1][2]="32 AND 24";
        questions[1][3]="32 AND 64";
        questions[1][4]="64 AND 32";  
        
        questions[2][0]="When is the object created with new keyword?";
        questions[2][1]="COMPILE TIME";
        questions[2][2]="DEPENDS ON CODE";
        questions[2][3]="RUN TIME";
        questions[2][4]="NONE OF THE ABOVE"; 
        
        
        questions[3][0]="Identify the corrected definition of a package.";
        questions[3][1]="A PACKAGE IS A COLLECTION OF EDITING TOOLS";
        questions[3][2]="A PACKAGE IS COLLECTION OF INTERFACES";
        questions[3][3]="A PACKAGE IS A COLLECTION OF INTERFACES AND CLASSES";
        questions[3][4]="A PACKAGE IS A COLLECTION OF CLASSES"; 
        
        questions[4][0]="JVM STANDS FOR";
        questions[4][1]="JAVA VIRTUAL MACHINE";
        questions[4][2]="JAVA VALUABLE MOTAR";
        questions[4][3]="JAVA VAM MINDSERVER";
        questions[4][4]="NONE OF THE ABOVE"; 
        
        questions[5][0]="Which of the following is a marker interface?";
        questions[5][1]="Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";
        
        questions[6][0] = "Which of the following is a mutable class in java?";
        questions[6][1] = "java.lang.StringBuilder";
        questions[6][2] = "java.lang.Short";
        questions[6][3] = "java.lang.Byte";
        questions[6][4] = "java.lang.String"; 
        
        questions[7][0]="In which of the following is toString() method defined?";
        questions[7][1]="java.lang.Object";
        questions[7][2]="java.lang.String";
        questions[7][3]="java.lang.Util";
        questions[7][4]="None"; 
        
        questions[8][0]="Total constructor string class have?";
        questions[8][1]="7";
        questions[8][2]="15";
        questions[8][3]="13";
        questions[8][4]="9"; 
        
        questions[9][0]="Identify the return type of a method that does not return any value.";
        questions[9][1]="int";
        questions[9][2]="byte";
        questions[9][3]="void";
        questions[9][4]="double"; 
        
        
        answers[0][1]="8";
        answers[1][1]="32 AND 64";
        answers[2][1]="RUN TIME";
        answers[3][1]="A PACKAGE IS A COLLECTION OF INTERFACES AND CLASSES";
        answers[4][1]="JAVA VIRTUAL MACHINE";
        answers[5][1]="Remote interface";
        answers[6][1]="java.lang.StringBuilder";
        answers[7][1]="java.lang.String";
        answers[8][1]="13";
        answers[9][1]="void";
        
        bt1 = new JRadioButton();
        bt1.setBounds(100,450,600,30);
        bt1.setFont(new Font("Dialog",Font.PLAIN,13));
        add(bt1);
        
        bt2 = new JRadioButton();
        bt2.setBounds(100,500,600,30);
        bt2.setFont(new Font("Dialog",Font.PLAIN,13));
        add(bt2);
        
        bt3 = new JRadioButton();
        bt3.setBounds(100,550,600,30);
        bt3.setFont(new Font("Dialog",Font.PLAIN,13));
        add(bt3);
        
        bt4 = new JRadioButton();
        bt4.setBounds(100,600,600,30);
        bt4.setFont(new Font("Dialog",Font.PLAIN,13));
        add(bt4);
        
         group = new ButtonGroup();
        group.add(bt1);
        group.add(bt2);
        group.add(bt3);
        group.add(bt4);
        
        next = new JButton("NEXT");
        next.setBounds(1100,550,200,40);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.blue);
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("LIFELINE");
        lifeline.setBounds(1100,600,200,40);
        lifeline.setBackground(Color.WHITE);
        lifeline.setForeground(Color.blue);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("SUBMIT");
        submit.setBounds(1100,650,200,40);
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.blue);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        
        
        start(count);
    
        
                
       
        
       setSize(1400,850);
       setLocation(0,70);
       setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        String time = "TIME LEFT - " + timer + " seconds.";
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.BOLD,22));
        if(timer>0){
            g.drawString(time,1100,500);
        }
        timer--;
        
        try{
            Thread.sleep( 1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        if(ans_given==1){
            ans_given=0;
            timer=15;
        }else if(timer<0){
            timer=15;
            bt1.setEnabled(true);
            bt2.setEnabled(true);
            bt3.setEnabled(true);
            bt4.setEnabled(true);
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9){
                 if(group.getSelection()==null){
                uanswers[count][0]="";
            }else{
                uanswers[count][0]=group.getSelection().getActionCommand();
            }
                for(int i=0;i<uanswers.length;i++){
                    if(uanswers[i][0].equals(answers[i][1])){
                        marks=marks+10;
                     }
                 }
                 setVisible(false);
                 new Score(name,marks);
            }else{
                if(group.getSelection()==null){
                uanswers[count][0]="";
            }else{
                uanswers[count][0]=group.getSelection().getActionCommand();
            }
            count++;
            start(count);
            }
        }
    }
    public  void start(int count){
        qno.setText(Integer.toString(count+1));
        Question.setText(questions[count][0]+"");
        
        
        bt1.setText(questions[count][1]);
        bt1.setActionCommand(questions[count][1]);
        
        
        bt2.setText(questions[count][2]);
        bt2.setActionCommand(questions[count][2]);
        
        
        bt3.setText(questions[count][3]);
        bt3.setActionCommand(questions[count][3]);
        
        
        bt4.setText(questions[count][4]);
        bt4.setActionCommand(questions[count][4]);
        
        group.clearSelection();
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==next){
            repaint();
            
            bt1.setEnabled(true);
            bt2.setEnabled(true);
            bt3.setEnabled(true);
            bt4.setEnabled(true);
            
            
            ans_given=1;
            if(group.getSelection()==null){
                uanswers[count][0]="";
            }else{
                uanswers[count][0]=group.getSelection().getActionCommand();
            }
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        }
        else if(e.getSource()==lifeline){
            if(count==1 || count==2 || count==3 || count==8 || count==9){
                bt1.setEnabled(false);
                bt4.setEnabled(false);
            }
            else if(count==0 || count==5 || count==7){
            bt3.setEnabled(false);
            bt1.setEnabled(false);
        } else{
                bt2.setEnabled(false);
                bt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
            
        }
        else if(e.getSource()==submit){
            ans_given=1;
             if(group.getSelection()==null){
                uanswers[count][0]="";
            }else{
                uanswers[count][0]=group.getSelection().getActionCommand();
            }
                 for(int i=0;i<uanswers.length;i++){
                     if(uanswers[i][0].equals(answers[i][1])){
                         marks+=10;
                     }
                 }
                 setVisible(false);
                 new Score(name,marks);
        }
    }
    
    public static void main(String args[]){
        new Quiz(name);
    }
}
