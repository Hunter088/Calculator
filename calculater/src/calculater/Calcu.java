
package calculater;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Calcu {
	
   JFrame frame = new JFrame();
	
	double num1, num2, result;
	String ans,ope;
	
public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcu window = new Calcu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public Calcu() {
		
		frame.setTitle("Calculator");
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setBounds(100, 100, 300, 422);
		frame.getContentPane().setLayout(null);
		
		JTextArea area = new JTextArea();
		area.setBounds(0, 0, 294, 58);
		area.setFont(new Font("serif" , Font.BOLD,33));
		frame.getContentPane().add(area);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = area.getText() + btn1.getText();
				area.setText(number);
			}
			});
		btn1.setBounds(0, 57, 100, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = area.getText() + btn2.getText();
				area.setText(number);
			}
			});
		btn2.setBounds(97, 57, 100, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = area.getText() + btn3.getText();
				area.setText(number);
			}
			});
		btn3.setBounds(194, 57, 100, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = area.getText() + btn4.getText();
				area.setText(number);
			}
			});
		btn4.setBounds(0, 120, 100, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = area.getText() + btn5.getText();
				area.setText(number);
			}
			});
		btn5.setBounds(97, 120, 100, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = area.getText() + btn6.getText();
				area.setText(number);
			}
			});
		btn6.setBounds(194, 120, 100, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = area.getText() + btn7.getText();
				area.setText(number);
			}
			});
		btn7.setBounds(0, 181, 100, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = area.getText() + btn8.getText();
				area.setText(number);
			}
			});
		btn8.setBounds(97, 181, 100, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = area.getText() + btn9.getText();
				area.setText(number);
			}
			});
		btn9.setBounds(194, 181, 100, 50);
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = area.getText() + btn0.getText();
				area.setText(number);
			}
			});
		btn0.setBounds(0, 242, 100, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1= Double.parseDouble(area.getText());
				area.setText("");
				ope = "+";
			}
			});
		btnadd.setBounds(0, 303, 74, 50);
		frame.getContentPane().add(btnadd);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1= Double.parseDouble(area.getText());
				area.setText("");
				ope = "-";
			}
			});
		btnsub.setBounds(74, 303, 74, 50);
		frame.getContentPane().add(btnsub);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1= Double.parseDouble(area.getText());
				area.setText("");
				ope = "*";
			}
			});
		btnmult.setBounds(148, 303, 74, 50);
		frame.getContentPane().add(btnmult);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1= Double.parseDouble(area.getText());
				area.setText("");
				ope = "/";
			}
			});
		btndiv.setBounds(222, 303, 73, 50);
		frame.getContentPane().add(btndiv);
		
		JButton btnclear = new JButton("Clear");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = 0.0;
				num2 = 0.0;
				area.setText(null);
			}
			});
		btnclear.setBounds(97, 242, 100, 50);
		frame.getContentPane().add(btnclear);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2 = Double.parseDouble(area.getText());
				
				if (ope == "/") {
					result = num1/num2;
					ans = String.format("%2f", result);
					area.setText(ans);
				}
				else if (ope=="*") {
					result = num1*num2;
					ans = String.format("%2f", result);
					area.setText(ans);
				}
				else if (ope=="-") {
					result = num1-num2;
					ans = String.format("%2f", result);
					area.setText(ans);
				}
				else if (ope=="+") {
					result = num1+num2;
					ans = String.format("%2f", result);
					area.setText(ans);
				}
				
			}
			});
		btnequal.setBounds(194, 242, 100, 50);
		frame.getContentPane().add(btnequal);
		
	}

	
	
}