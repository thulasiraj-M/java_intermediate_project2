package exercise_program;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class puzle extends Frame implements ActionListener{
	
	Button  a,b,c,d,e,f,g,h,i;
	puzle(){
		
		a=new Button("1");
		a.setBounds(100,100,50,30);
		a.addActionListener(this);
		add(a);
		b=new Button("2");
		b.setBounds(150,100,50,30);
		b.addActionListener(this);
		add(b);
		c=new Button("3");
		c.setBounds(200,100,50,30);
		c.addActionListener(this);
		add(c);
		d=new Button("2");
		d.setBounds(100,130,50,30);
		d.addActionListener(this);
		add(d);
		e=new Button("3");
		e.setBounds(150,130,50,30);
		e.addActionListener(this);
		add(e);
		f=new Button("1");
		f.setBounds(200,130,50,30);
		f.addActionListener(this);
		add(f);
		g=new Button("");
		g.setBounds(100,160,50,30);
		g.addActionListener(this);
		add(g);
		h=new Button("1");
		h.setBounds(150,160,50,30);
		h.addActionListener(this);
		add(h);
		i=new Button("2");
		i.setBounds(200,160,50,30);
		i.addActionListener(this);
		add(i);
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		setBackground(Color.CYAN);
		
		
}
	
	public void actionPerformed(ActionEvent z) {
		if(z.getSource()==a){  
	        String ip=a.getLabel();  
	        if(b.getLabel().equals("")){  
	            b.setLabel(ip);  
	            a.setLabel("");  
	        }  
	       
	        if(d.getLabel().equals("")) {
	        	d.setLabel(ip);
	        	a.setLabel("");
	        }
	        
		
		if(z.getSource()==b) {
			String ip1 =b.getLabel();
			if(a.getLabel().equals("")) {
				a.setLabel(ip1);
				b.setLabel("");
			}
			if(c.getLabel().equals("")) {
				c.setLabel(ip1);
				b.setLabel("");
				
			}
			if(e.getLabel().equals("")) {
				e.setLabel(ip1);
				b.setLabel("");
			}
		}
			
		    
	 
		if(z.getSource()==c) {
			String ip2 =c.getLabel();
			
			if(b.getLabel().equals("")) {
				b.setLabel(ip2);
				c.setLabel("");
				
			}
			if(f.getLabel().equals("")) {
				f.setLabel(ip2);
				c.setLabel("");
			}
			
		    
	 }
		if(z.getSource()==d) {
			String ip3=d.getLabel();
			if(a.getLabel().equals("")) {
				a.setLabel(ip3);
				d.setLabel("");
			}
			if(g.getLabel().equals("")) {
				g.setLabel(ip3);
				d.setLabel("");
				
			}
			if(e.getLabel().equals("")) {
				e.setLabel(ip3);
				d.setLabel("");
			}
			
		    
	 }
		if(z.getSource()==e) {
			String ip4=e.getLabel();
			if(b.getLabel().equals("")) {
				b.setLabel(ip4);
				e.setLabel("");
			}
			if(d.getLabel().equals("")) {
				d.setLabel(ip4);
				e.setLabel("");
				
			}
			if(f.getLabel().equals("")) {
				f.setLabel(ip4);
				e.setLabel("");
			}
			if(h.getLabel().equals("")) {
				h.setLabel(ip4);
				e.setLabel("");
			}
		    
	 }
		if(z.getSource()==f) {
			String ip5=b.getLabel();
			if(c.getLabel().equals("")) {
				c.setLabel(ip5);
				f.setLabel("");
			}
			if(e.getLabel().equals("")) {
				e.setLabel(ip5);
				f.setLabel("");
				
			}
			
			if(i.getLabel().equals("")) {
				i.setLabel(ip5);
				f.setLabel("");
			}
		    
	 }
		if(z.getSource()==g) {
			String ip6=g.getLabel();
			
			if(d.getLabel().equals("")) {
				d.setLabel(ip6);
				g.setLabel("");
				
			}
			if(h.getLabel().equals("")) {
				h.setLabel(ip6);
				g.setLabel("");
			}
			
		    
	 }
		if(z.getSource()==h) {
			String ip7=h.getLabel();
			
			if(e.getLabel().equals("")) {
				e.setLabel(ip7);
				h.setLabel("");
				
			}
			if(g.getLabel().equals("")) {
				g.setLabel(ip7);
				h.setLabel("");
			}
			if(i.getLabel().equals("")) {
				i.setLabel(ip7);
				h.setLabel("");
			}
		    
	 }
		if(z.getSource()==i) {
			String ip8=i.getLabel();
			
			if(h.getLabel().equals("")) {
				h.setLabel(ip8);
				i.setLabel("");
			}
			if(f.getLabel().equals("")) {
				f.setLabel(ip8);
				i.setLabel("");
			}
		    
	 }
		if(a.getLabel()=="1" && b.getLabel()=="2" && c.getLabel()=="3" && d.getLabel()=="2" &&
				e.getLabel()=="3" && f.getLabel()=="1" && h.getLabel()=="1" && i.getLabel()=="2"
				&& g.getLabel()== "") {
			JOptionPane.showMessageDialog(this, "YOU ARE WON THE MATCH..!!");
			
		}
		}
		
	}

	
	
public static void main(String[]args) {
	puzle P=new puzle();
}
	}
	

