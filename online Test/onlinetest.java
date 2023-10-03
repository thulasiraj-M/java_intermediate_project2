package raj1;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;

public class onlinetest extends JFrame implements ActionListener  {
	  
	  
	 
	    JLabel l;  
	    JRadioButton jb[]=new JRadioButton[5];  
	    JButton b1,b2;  
	    ButtonGroup bg;  
	    int count=0,current=0,x=1,y=1,now=0;  
	    int m[]=new int[10];      
	    onlinetest(String s)  
	    {  
	        super(s);  
	        l=new JLabel();  
	        add(l);  
	        bg=new ButtonGroup();  
	        for(int i=0;i<5;i++)  
	        {  
	            jb[i]=new JRadioButton();     
	            add(jb[i]);  
	            bg.add(jb[i]);  
	        }  
	        b1=new JButton("Next");  
	        b2=new JButton("Bookmark");  
	        b1.addActionListener(this);  
	        b2.addActionListener(this);  
	        add(b1);add(b2);  
	        set();  
	        l.setBounds(30,40,450,20);  
	        jb[0].setBounds(50,80,100,20);  
	        jb[1].setBounds(50,110,100,20);  
	        jb[2].setBounds(50,140,100,20);  
	        jb[3].setBounds(50,170,100,20);  
	        b1.setBounds(100,240,100,30);  
	        b2.setBounds(270,240,100,30);
	        setLayout(null);  
	        setLocation(250,100);  
	        setVisible(true);  
	        setSize(600,350);  
	    }  
	    public void actionPerformed(ActionEvent e)  
	    {  
	        if(e.getSource()==b1)  
	        {  
	            if(check())  
	                count=count+1;  
	            current++;  
	            set();    
	            if(current==9)  
	            {  
	                b1.setEnabled(false);  
	                b2.setText("Result");  
	            }  
	        }  
	        if(e.getActionCommand().equals("Bookmark"))  
	        {  
	            JButton bk=new JButton("Bookmark"+x);  
	            bk.setBounds(480,20+30*x,100,30);  
	            add(bk);  
	            bk.addActionListener(this);  
	            m[x]=current;  
	            x++;  
	            current++;  
	            set();    
	            if(current==9)  
	                b2.setText("Result");  
	            setVisible(false);  
	            setVisible(true);  
	        }  
	        for(int i=0,y=1;i<x;i++,y++)  
	        {  
	        if(e.getActionCommand().equals("Bookmark"+y))  
	        {  
	            if(check())  
	                count=count+1;  
	            now=current;  
	            current=m[y];  
	            set();  
	            ((JButton)e.getSource()).setEnabled(false);  
	            current=now;  
	        }  
	        }  
	      
	        if(e.getActionCommand().equals("Result"))  
	        {  
	            if(check())  
	                count=count+1;  
	            current++;  
	          
	            JOptionPane.showMessageDialog(this,"correct ans="+count);  
	            System.exit(0);  
	        }  
	    }  
	    void set()  
	    {  
	        jb[4].setSelected(true);  
	        if(current==0)  
	        {  
	            l.setText("Que1: Whole values datatype?");  
	            jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");   
	        }  
	        if(current==1)  
	        {  
	            l.setText("Que2: what is a front end lang?");  
	            jb[0].setText("java");jb[1].setText(".net");jb[2].setText("css");jb[3].setText("c++");  
	        }  
	        if(current==2)  
	        {  
	            l.setText("Que3: tell me,  what is the  purpose of oops ?");  
	            jb[0].setText("nothing");jb[1].setText("object processing");jb[2].setText("object dlt");jb[3].setText("just language");  
	        }  
	        if(current==3)  
	        {  
	            l.setText("Que4: String class is defined in which package?");  
	            jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");  
	        }  
	        if(current==4)  
	        {  
	            l.setText("Que5: deefine a string?");  
	            jb[0].setText("function");jb[1].setText("collection of char");jb[2].setText("input");jb[3].setText("topic");  
	        }  
	        if(current==5)  
	        {  
	            l.setText("Que6: Which one among these is not a keyword?");  
	            jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");  
	        }  
	        if(current==6)  
	        {  
	            l.setText("Que7: Which one among these is not java? ");  
	            jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");  
	                        jb[3].setText("tuple");  
	        }  
	        if(current==7)  
	        {  
	            l.setText("Que8: which one among these is a eclipse color?");  
	            jb[0].setText("yellow");jb[1].setText("blue");jb[2].setText("red");  
	                        jb[3].setText("violet");         
	        }  
	        if(current==8)  
	        {  
	            l.setText("Que9: what is a colour keyword of java?");  
	            jb[0].setText("colour");jb[1].setText("Colour");jb[2].setText("Color");jb[3].setText("color");  
	        }  
	        if(current==9)  
	        {  
	            l.setText("Que10: tell me, eazy topic of java?");  
	            jb[0].setText("oops");jb[1].setText("if stmt");jb[2].setText("loopings");  
	                        jb[3].setText("events");  
	        }  
	        l.setBounds(30,40,450,20);  
	        for(int i=0,j=0;i<=90;i+=30,j++)  
	            jb[j].setBounds(50,80+i,200,20);  
	    }  
	    boolean check()  
	    {  
	        if(current==0)  
	            return(jb[0].isSelected());  
	        if(current==1)  
	            return(jb[2].isSelected());  
	        if(current==2)  
	            return(jb[1].isSelected());  
	        if(current==3)  
	            return(jb[0].isSelected());  
	        if(current==4)  
	            return(jb[1].isSelected());  
	        if(current==5)  
	            return(jb[2].isSelected());  
	        if(current==6)  
	            return(jb[3].isSelected());  
	        if(current==7)  
	            return(jb[3].isSelected());  
	        if(current==8)  
	            return(jb[2].isSelected());  
	        if(current==9)  
	            return(jb[2].isSelected());  
	        return false;  
	    }  
	    public static void main(String s[])  
	    {  
	        new onlinetest("Online Test Of Java");  
	    }  
	}


