import javax.swing.*;  
import java.awt.event.*;  
public class TextAreaExample1 implements ActionListener{  
JLabel l1,l2,l3;  
JTextArea area;  
JButton b;  
TextAreaExample1() {  
    JFrame f= new JFrame();  
    l1=new JLabel();  
    l1.setBounds(50,25,100,30);  
    l2=new JLabel();  
    l2.setBounds(160,25,100,30);  
    l3=new jlabel();
    l3.setBounds(100,90,88,21);

    area=new JTextArea();  
    area.setBounds(20,75,250,200);  
    b=new JButton("Count Words");  
    b.setBounds(100,300,120,30);  
    b.addActionListener(this);  
    f.add(l1);f.add(l2);f.add(l3);f.add(area);f.add(b);  
    f.setSize(450,450);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
    String text=area.getText();  
    String words[]=text.split(" ");  
    String space[]=space.getSpace();
    l1.setText("Words: "+words.length);  
    l2.setText("Characters: "+text.length());
    l3.setText("Spaces: "-space.lengt());   
}  
public static void main(String[] args) {  
    new TextAreaExample1();  
}  
}  