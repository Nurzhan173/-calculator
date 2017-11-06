package calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class calc2 extends JFrame{
	
	int a;
	int b;
	String c;
	calc obj = new calc();
	
	calc2(){
		super("Calc");
		setSize(205,247);//super(400,400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		final JTextField tf = new JTextField();
		tf.setBounds(0, 0, 200, 70);
		tf.setFont(new Font("Times New Roman",30,30));
		tf.setHorizontalAlignment(JTextField.RIGHT);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("0");
		
		
		b1.setBounds(0, 160, 50, 30);
		b2.setBounds(50, 160, 50, 30);
		b3.setBounds(100, 160, 50, 30);
		b4.setBounds(0, 130, 50, 30);
		b5.setBounds(50, 130, 50, 30);
		b6.setBounds(100, 130, 50, 30);
		b7.setBounds(0, 100, 50, 30);
		b8.setBounds(50, 100, 50, 30);
		b9.setBounds(100, 100, 50, 30);
		b0.setBounds(50, 190, 50, 30);
		
		
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton equal = new JButton("=");
		JButton change = new JButton("C");
		JButton kobeitu = new JButton("*");
		JButton bolu = new JButton("/");
		JButton plusnaminus = new JButton("+/-");
		JButton kv = new JButton("^2");
		//JButton mod = new JButton("M");
		JButton percent = new JButton("%");
		JButton tbasty = new JButton("sq");
		
		
		
		
		change.setBounds(0,70,50,30);
		plus.setBounds(150, 160, 50, 30);
		minus.setBounds(150, 130, 50, 30);
		equal.setBounds(150, 190, 50, 30);
		kobeitu.setBounds(150, 100, 50, 30);
		bolu.setBounds(150, 70, 50, 30);
		plusnaminus.setBounds(0, 190, 50, 30);
		kv.setBounds(50, 70, 50, 30);
		//mod.setBounds(100, 70, 50, 30);
		tbasty.setBounds(100, 190, 50, 30);
		percent.setBounds(100, 70, 50, 30);
		
		plus.setBackground(new java.awt.Color(250,250,250));
		change.setBackground(new java.awt.Color(250,250,250));
		minus.setBackground(new java.awt.Color(250,250,250));
		equal.setBackground(new java.awt.Color(102,178,255));
		kobeitu.setBackground(new java.awt.Color(250,250,250));
		bolu.setBackground(new java.awt.Color(250,250,250));
		plusnaminus.setBackground(new java.awt.Color(250,250,250));
		kv.setBackground(new java.awt.Color(250,250,250));
		percent.setBackground(new java.awt.Color(250,250,250));
		tbasty.setBackground(new java.awt.Color(250,250,250));
		b1.setBackground(new java.awt.Color(250,250,250));
		b2.setBackground(new java.awt.Color(250,250,250));
		b3.setBackground(new java.awt.Color(250,250,250));
		b4.setBackground(new java.awt.Color(250,250,250));
		b5.setBackground(new java.awt.Color(250,250,250));
		b6.setBackground(new java.awt.Color(250,250,250));
		b7.setBackground(new java.awt.Color(250,250,250));
		b8.setBackground(new java.awt.Color(250,250,250));
		b9.setBackground(new java.awt.Color(250,250,250));
		b0.setBackground(new java.awt.Color(250,250,250));
		plus.setForeground(new java.awt.Color(102,178,255));
		equal.setForeground(new java.awt.Color(250,250,250));
		change.setForeground(new java.awt.Color(255,51,51));
		minus.setForeground(new java.awt.Color(102,178,255));
		kobeitu.setForeground(new java.awt.Color(102,178,255));
		bolu.setForeground(new java.awt.Color(102,178,255));
		plusnaminus.setForeground(new java.awt.Color(102,178,255));
		kv.setForeground(new java.awt.Color(102,178,255));
		percent.setForeground(new java.awt.Color(102,178,255));
		tbasty.setForeground(new java.awt.Color(102,178,255));
		
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"1");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"2");
				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"3");
				
			}
		});
			
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"4");
				
			}
		});
		
		
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"5");
				
			}
		});
		
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"6");
				
			}
		});

		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"7");
				
			}
		});
		
		
		b8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"8");
				
			}
		});
		
		b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"9");
				
			}
		});
		
		b0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"0");
				
			}
		});
		
		
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = "+";
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = "-";
			}
		});
		
		

		change.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = "C";
			}
		});
		
		
		kobeitu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = "*";
			}
		});
		
		bolu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = "/";
			}
		});
		
		plusnaminus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText((int)obj.plusnaminus(a)+"");
				c = "+/-";
			}
		});
		
		
		
		kv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText((int)obj.kv(a)+"");
				c = "^2";
			}
		});
		
		
		percent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = "%";
			}
		});
		
		
		tbasty.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText((double)obj.tbasty(a)+"");
				c = "sq";
			}
		});
		
		
		
		
		
		
		
		
		equal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b = Integer.parseInt(tf.getText());
				if(c=="+")
					tf.setText((int)obj.plus(a, b)+"");
				if(c=="-")
					tf.setText((int)obj.minus(a, b)+"");
				if(c=="C")
					tf.setText(obj.change(a, b)+"");
				if(c=="*")
					tf.setText((int)obj.kobeitu(a, b)+"");
				if(c=="/")
					tf.setText((int)obj.bolu(a, b)+"");
				if(c=="%")
					tf.setText((int)obj.percent(a,b)+"");
				
				
				c=" ";
				a=0;
				b=0;
				}
		});
		
		add(tf);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(bolu);
		add(kobeitu);
		add(kv);
		add(percent);
		add(plusnaminus);
		add(change);
		add(plus);
		add(minus);
		add(equal);
		add(tbasty);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new calc2();
	}

}