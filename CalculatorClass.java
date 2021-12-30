package apps;

import java.awt.*;
import java.awt.event.*;


class Calculator extends WindowAdapter implements ActionListener{
	
	Frame f=new Frame();
	
	String s1,s2="",s3;
	double n1,n2;
	
	Button b1=new Button("+");
	Button b2=new Button("-");
	Button b3=new Button("*");
	Button b4=new Button("/");
	Button b5=new Button("0");
	Button b6=new Button("1");
	Button b7=new Button("2");
	Button b8=new Button("3");
	Button b9=new Button("4");
	Button b10=new Button("5");
	Button b11=new Button("6");
	Button b12=new Button("7");
	Button b13=new Button("8");
	Button b14=new Button("9");
	Button b15=new Button("=");
	Button b16=new Button(".");
	Button b17=new Button("cos");
	
	TextField tf=new TextField();
	
	
	Calculator(){
		
		
		b1.setBounds(30,60,30,30);
		b2.setBounds(60,60,30,30);
		b3.setBounds(90,60,30,30);
		b4.setBounds(120,60,30,30);
		b5.setBounds(30,90,30,30);
		b6.setBounds(60,90,30,30);
		b7.setBounds(90,90,30,30);
		b8.setBounds(120,90,30,30);
		b9.setBounds(30,120,30,30);
		b10.setBounds(60,120,30,30);
		b11.setBounds(90,120,30,30);
		b12.setBounds(120,120,30,30);
		b13.setBounds(30,150,30,30);
		b14.setBounds(60,150,30,30);
		b16.setBounds(90,150,30,30);
		b15.setBounds(120,150,30,30);
	//	b17.setBounds(150,60,30,30);
		
		tf.setBounds(30,200,150,60);
	
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		//f.add(b17);
		
		f.add(tf);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		//b17.addActionListener(this);
		
		f.addWindowListener(this);
		f.setBackground(Color.CYAN);
		f.setSize(250,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	
	public void actionPerformed(ActionEvent e) {
		s1="";
		
		if(e.getSource()==b17) {
			s3="cos";
		}
		if(e.getSource()==b16) {
			s1=".";
		}
		if(e.getSource()==b5) {
			s1="0";
		}
		if(e.getSource()==b6) {
			s1="1";
		}
		if(e.getSource()==b7) {
			s1="2";
		}
		if(e.getSource()==b8) {
			s1="3";
		}
		if(e.getSource()==b9) {
			s1="4";
		}
		if(e.getSource()==b10) {
			s1="5";
		}
		if(e.getSource()==b11) {
			s1="6";
		}
		if(e.getSource()==b12) {
			s1="7";
		}
		if(e.getSource()==b13) {
			s1="8";
		}
		if(e.getSource()==b14) {
			s1="9";
		}
		
		s2+=s1;
		tf.setText(s2);
		
		if(e.getSource()==b1) {
			n2=Double.parseDouble(s2);
			s2="";
			s3="+";
		}
		if(e.getSource()==b2) {
			n2=Double.parseDouble(s2);
			s2="";
			s3="-";
		}
		if(e.getSource()==b3) {
			n2=Double.parseDouble(s2);
			s2="";
			s3="*";
		}
		if(e.getSource()==b4) {
			n2=Double.parseDouble(s2);
			s2="";
			s3="/";
		}
		if(e.getSource()==b15) {
			n1=Double.parseDouble(s2);
			if(s3=="+") {
				tf.setText(String.valueOf(n1+n2));
				s2=String.valueOf(n1+n2);
			}
			if(s3=="-") {
				tf.setText(String.valueOf(n2-n1));
				s2=String.valueOf(n2-n1);
			}
			if(s3=="*") {
				tf.setText(String.valueOf(n1*n2));
				s2=String.valueOf(n1*n2);
			}
			if(s3=="/") {
				tf.setText(String.valueOf(n2/n1));
				s2=String.valueOf(n2/n1);
			}
			n2=Double.parseDouble(s2);
			if(s3=="cos") {
				double rad=Math.toRadians(n1);
				n2=Math.cos(rad);
				tf.setText(String.valueOf(n2));
				s2=String.valueOf(n2);
			}
		}
	}	
}

public class CalculatorClass {
	public static void main(String args[]) {
		new Calculator();
	}
}