package exercise_program;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class calculator extends Frame implements ActionListener{
	Label l1,l2,l3,l4;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,bb;
	TextField t1,t2,t3;
	calculator(){
		l1=new Label("INPUT 1");
		l1.setBounds(80,60,100,20);
		add(l1);
		t1=new TextField();
		t1.setBounds(190,60,100,20);
		add(t1);
		l2=new Label("INPUT 2");
		l2.setBounds(80,90,100,20);
		add(l2);
		t2=new TextField();
		t2.setBounds(190,90,100,20);
		add(t2);
		l3=new Label("OUTPUT");
		l3.setBounds(80,120,100,20);
		add(l3);
		t3=new TextField();
		t3.setBounds(190,120,100,20);
		t3.setEditable(false);
		add(t3);
		l4=new Label("OPERATION'S:");
		l4.setBounds(120,180,100,20);
		add(l4);
		
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		b5=new Button("%");
		b6=new Button("&");
		b7=new Button("|");
		b8=new Button("^");
		b9=new Button("<<");
		bb=new Button(">>");
		
		b1.setBounds(190,220,50,30);
		b2.setBounds(190,260,50,30);
		b3.setBounds(190,300,50,30);
		b4.setBounds(190,340,50,30);
		b5.setBounds(190,380,50,30);
		b6.setBounds(260,220,50,30);
		b7.setBounds(260,260,50,30);
		b8.setBounds(260,300,50,30);
		b9.setBounds(260,340,50,30);
		bb.setBounds(260,380,50,30);
		
		b1.setBackground(Color.pink);
		b2.setBackground(Color.PINK);
		b3.setBackground(Color.PINK);
		b4.setBackground(Color.PINK);
		b5.setBackground(Color.PINK);
		b6.setBackground(Color.PINK);
		b7.setBackground(Color.PINK);
		b8.setBackground(Color.PINK);
		b9.setBackground(Color.PINK);
		bb.setBackground(Color.PINK);
		
		
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(bb);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bb.addActionListener(this);
		
		
		setSize(600,600);    
        setLayout(null);    
        setVisible(true);
        setBackground(Color.cyan);
        
	}
        
        public void actionPerformed(ActionEvent e) {
        	String ip1 = t1.getText();
        	String ip2 = t2.getText();
        	 int a = Integer.parseInt(ip1);
        	 int b = Integer.parseInt(ip2);
        	 int c = 0;
        	 if(e.getSource()== b1) {
        		 c=a+b;
        	 }
        	 if(e.getSource()== b2) {
        		 c=a-b;
        	 }
        	 if(e.getSource()== b3) {
        		 c=a*b;
        	 }
        	 if(e.getSource()== b4) {
        		 c=a/b;
        	 }
        	 if(e.getSource()== b5) {
        		 c=a%b;
        	 }
        	 if(e.getSource()== b6) {
        		 c=a&b;
        	 }
        	 if(e.getSource()== b7) {
        		 c=a|b;
        	 }
        	 if(e.getSource()== b8) {
        		 c=a^b;
        	 }
        	 if(e.getSource()== b9) {
        		 c=a<<b;
        	 }
        	 if(e.getSource()== bb) {
        		 c=a>>b;
        	 }
        	 
        	 String Op = String.valueOf(c);
        	 t3.setText(Op);
        	
        	
        	
        	
        	
        	
        
        }
    		
    		
		
		
	
	public static void main(String[]args) {
		calculator C=new calculator();
	}

	

}
