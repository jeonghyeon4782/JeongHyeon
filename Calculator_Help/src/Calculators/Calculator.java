package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;

	private JFrame frmHello;
	private JTextField txtDisplay;
	private JButton btn8;
	private JButton btnInti;
	private JButton btnPercent;
	private JButton btnPlus;
	private JButton btnBack_1;
	private JButton btnInti_1;
	private JButton btnPercent_1;
	private JButton btnPlus_1;
	private JButton btnBack_2;
	private JButton btnInti_2;
	private JButton btnPercent_2;
	private JButton btnPlus_2;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnDiv;
	private JButton btn0;
	private JButton btnDot;
	private JButton btnTransfer;
	private JButton btnEqual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmHello.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHello = new JFrame();
		frmHello.setTitle("장정현 계산기");
		frmHello.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmHello.setBounds(100, 100, 272, 412);
		frmHello.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHello.getContentPane().setLayout(null);

		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 5, 230, 51);
		frmHello.getContentPane().add(txtDisplay, BorderLayout.NORTH);
		txtDisplay.setColumns(10);
		
			

		// ---------------------- row 1 ----------------------------------

		JButton btnBack = new JButton("<");
		btnBack.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if (txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backSpace = strB.toString();
					txtDisplay.setText(backSpace);
				}
			}
		});
		btnBack.setBounds(10, 66, 50, 50);
		frmHello.getContentPane().add(btnBack);

		btnInti = new JButton("C");
		btnInti.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btnInti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnInti.setBounds(70, 66, 50, 50);
		frmHello.getContentPane().add(btnInti);

		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPercent.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btnPercent.setBounds(130, 66, 50, 50);
		frmHello.getContentPane().add(btnPercent);

		btnPlus = new JButton("+");
		btnPlus.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setBounds(190, 66, 50, 50);
		frmHello.getContentPane().add(btnPlus);
		
		// ---------------------- row 2 ----------------------------------
			
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btn7.setBounds(10, 126, 50, 50);
		frmHello.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btn8.setBounds(70, 126, 50, 50);
		frmHello.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btn9.setBounds(130, 126, 50, 50);
		frmHello.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btnSub.setBounds(190, 126, 50, 50);
		frmHello.getContentPane().add(btnSub);
		
		// ---------------------- row 3 ----------------------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btn4.setBounds(10, 186, 50, 50);
		frmHello.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btn5.setBounds(70, 186, 50, 50);
		frmHello.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btn6.setBounds(130, 186, 50, 50);
		frmHello.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMul.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btnMul.setBounds(190, 186, 50, 50);
		frmHello.getContentPane().add(btnMul);
		
		// ---------------------- row 4 ----------------------------------
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btn1.setBounds(10, 246, 50, 50);
		frmHello.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btn2.setBounds(70, 246, 50, 50);
		frmHello.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btn3.setBounds(130, 246, 50, 50);
		frmHello.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btnDiv.setBounds(190, 246, 50, 50);
		frmHello.getContentPane().add(btnDiv);
		
		// ---------------------- row 5 ----------------------------------
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btn0.setBounds(10, 306, 50, 50);
		frmHello.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDot.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btnDot.setBounds(70, 306, 50, 50);
		frmHello.getContentPane().add(btnDot);
		
		JButton btnTransfer = new JButton("±");
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnTransfer.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btnTransfer.setBounds(130, 306, 50, 50);
		frmHello.getContentPane().add(btnTransfer);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNum = Double.parseDouble(txtDisplay.getText());
				
				if (operations == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if (operations == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if (operations == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if (operations == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if (operations == "%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("함초롬바탕", Font.BOLD, 20));
		btnEqual.setBounds(190, 306, 50, 50);
		frmHello.getContentPane().add(btnEqual);


	}
}
