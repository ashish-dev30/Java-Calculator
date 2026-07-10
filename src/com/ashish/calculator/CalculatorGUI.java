package com.ashish.calculator;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculatorGUI implements ActionListener, KeyListener {
	
	private JFrame frame;
	private JTextField display;
	
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMul;
	private JButton btnDiv;
	private JButton btnMod;
	private JButton btnEqual;
	private JButton btnClear;
	private JButton btnBackspace;
	
	private int firstNumber;
	private int secondNumber;
	private String operator = "";
	
	private Operations op = new Operations();
	
	public CalculatorGUI() {
		frame = new JFrame("Java Calculator");
		
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		frame.setLayout(null);
		
		display = new JTextField();
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setEditable(false);
		display.setFont(new Font("Arial", Font.BOLD, 24));
		display.setBounds(20, 20, 340, 60);
		
		btnMod = new JButton("%");
		btnClear = new JButton("C");
		btnClear.setForeground(Color.RED);
		btnBackspace = new JButton("⌫");
		
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnDiv = new JButton("/");

		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btnMul = new JButton("*");		
		
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btnSub = new JButton("-");
		
		btn0 = new JButton("0");
		
		btnEqual = new JButton("=");
		btnEqual.setBackground(Color.BLUE);
		btnEqual.setForeground(Color.WHITE);
		btnAdd = new JButton("+");
				
//Size of all btn Start
		btnMod.setBounds(110,90,80,50);
		btnClear.setBounds(200,90,80,50);
		btnBackspace.setBounds(290, 90, 70, 50);
		
		btn7.setBounds(20,150,80,50);
		btn8.setBounds(110,150,80,50);
		btn9.setBounds(200,150,80,50);
		btnDiv.setBounds(290,150,70,50);

		btn4.setBounds(20,210,80,50);
		btn5.setBounds(110,210,80,50);
		btn6.setBounds(200,210,80,50);
		btnMul.setBounds(290,210,70,50);

		btn1.setBounds(20,270,80,50);
		btn2.setBounds(110,270,80,50);
		btn3.setBounds(200,270,80,50);
		btnSub.setBounds(290,270,70,50);

		btn0.setBounds(20,330,170,50);
		btnEqual.setBounds(200,330,80,50);
		btnAdd.setBounds(290,330,70,50);
//Size of all btn End
		
//Display all btn Start
		frame.add(display);
		
		frame.add(btnMod);
		btnMod.addActionListener(this);
		frame.add(btnClear);
		btnClear.addActionListener(this);
		frame.add(btnBackspace);
		btnBackspace.addActionListener(this);
		
		frame.add(btn7);
		btn7.addActionListener(this);
		frame.add(btn8);
		btn8.addActionListener(this);
		frame.add(btn9);
		btn9.addActionListener(this);
		frame.add(btnDiv);
		btnDiv.addActionListener(this);

		frame.add(btn4);
		btn4.addActionListener(this);
		frame.add(btn5);
		btn5.addActionListener(this);
		frame.add(btn6);
		btn6.addActionListener(this);
		frame.add(btnMul);
		btnMul.addActionListener(this);

		frame.add(btn1);
		btn1.addActionListener(this);
		frame.add(btn2);
		btn2.addActionListener(this);
		frame.add(btn3);
		btn3.addActionListener(this);
		frame.add(btnSub);
		btnSub.addActionListener(this);

		frame.add(btn0);
		btn0.addActionListener(this);
		frame.add(btnEqual);
		btnEqual.addActionListener(this);
		frame.add(btnAdd);
		btnAdd.addActionListener(this);
//Display all btn Start
		
		display.addKeyListener(this);
		frame.setFocusable(true);
		frame.requestFocus();
		frame.setVisible(true); 
	}
	
	private void calculateResult() {
		secondNumber = Integer.parseInt(display.getText());
		
		switch (operator) {
		case "+":
			 int answer = op.add(firstNumber, secondNumber);
			 display.setText(String.valueOf(answer));
			 operator = "";
			 break;
			
		case "-":
			answer = op.subtraction(firstNumber, secondNumber);
			display.setText(String.valueOf(answer));
			operator = "";
			break;
			
		case "*":
			answer = op.multiplication(firstNumber, secondNumber);
			display.setText(String.valueOf(answer));
			operator = "";
			break;
			
		case "/":
			try {
				answer = op.division(firstNumber, secondNumber);
				display.setText(String.valueOf(answer));
				operator = "";
			} catch (ArithmeticException  ex) {
			    display.setText("Cannot divide by zero.");
			}
			break;
			
		case "%":
			answer = op.modulus(firstNumber, secondNumber);
			display.setText(String.valueOf(answer));
			operator = "";
			break;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn0) {
			display.setText(display.getText() + "0");
		}
		if(e.getSource() == btn1) {
			display.setText(display.getText() + "1");
		}
		if(e.getSource() == btn2) {
			display.setText(display.getText() + "2");
		}
		if(e.getSource() == btn3) {
			display.setText(display.getText() + "3");
		}
		if(e.getSource() == btn4) {
			display.setText(display.getText() + "4");
		}
		if(e.getSource() == btn5) {
			display.setText(display.getText() + "5");
		}
		if(e.getSource() == btn6) {
			display.setText(display.getText() + "6");
		}
		if(e.getSource() == btn7) {
			display.setText(display.getText() + "7");
		}
		if(e.getSource() == btn8) {
			display.setText(display.getText() + "8");
		}
		if(e.getSource() == btn9) {
			display.setText(display.getText() + "9");
		}
		
		if(e.getSource() == btnAdd) {
			setOperator("+");
		}		
		if(e.getSource() == btnSub) {
			setOperator("-");
		}		
		if(e.getSource() == btnMul) {
			setOperator("*");
		}		
		if(e.getSource() == btnDiv) {
			setOperator("/");
		}	
		if(e.getSource() == btnMod) {
			setOperator("%");
		}
		
		if(e.getSource() == btnEqual) {
			calculateResult();
		}		
		if(e.getSource() == btnClear) {
			display.setText("");
			firstNumber = 0;
			secondNumber = 0;
			operator = "";
		}	
		
		if(e.getSource() == btnBackspace) {
			backspace();
		}
	}
	
	private void backspace() {
		 String text = display.getText();
		 if(text.length() > 0) {
			 display.setText(text.substring(0, text.length() - 1));
		 }
	}

	public static void main(String[] args) {
		new CalculatorGUI();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	private void setOperator(String op) {
	    firstNumber = Integer.parseInt(display.getText());
	    operator = op;
	    display.setText("");
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		char ch = e.getKeyChar();
		
		if(ch >= '0' && ch <= '9') {
			display.setText(display.getText() + ch);
		}
		
		if(ch == '+') {
		    setOperator("+");
		    
		} else if(ch == '-') {
			setOperator("-");
			
		} else if(ch == '*') {
			setOperator("*");

		} else if(ch == '/') {
			setOperator("/");

		} else if(ch == '%') {
			setOperator("%");
		}
		
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			calculateResult();
		}
		
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			backspace();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
