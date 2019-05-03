package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 294, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 27, 251, 45);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//----------------Row 0--------------------
		JButton btnBack = new JButton("\uF0E7");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(txtDisplay.getText().length()>0){
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
				
			}
		});
		btnBack.setFont(new Font("Widgdings", Font.BOLD, 18));
		btnBack.setBounds(10, 83, 57, 50);
		frame.getContentPane().add(btnBack);
		
		JButton BtnC = new JButton("C");
		BtnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null );
			}
		});
		BtnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtnC.setBounds(77, 83, 57, 50);
		frame.getContentPane().add(BtnC);
		
		JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
				
			}
		});
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPer.setBounds(142, 83, 57, 50);
		frame.getContentPane().add(btnPer);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(204, 83, 57, 50);
		frame.getContentPane().add(btnPlus);
		
		//----------------Row 1--------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 144, 57, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(77, 144, 57, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(142, 144, 57, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(204, 144, 57, 50);
		frame.getContentPane().add(btnSub);
			//----------------Row 2--------------------
			JButton btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn4.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn4.setBounds(10, 205, 57, 50);
			frame.getContentPane().add(btn4);
			
			JButton btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn5.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn5.setBounds(77, 205, 57, 50);
			frame.getContentPane().add(btn5);
			
			JButton btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn6.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn6.setBounds(142, 205, 57, 50);
			frame.getContentPane().add(btn6);
			
			JButton btnMul = new JButton("*");
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					firstnum = Double.parseDouble(txtDisplay.getText());
					txtDisplay.setText("");
					operations = "*";
				}
			});
			btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnMul.setBounds(204, 205, 57, 50);
			frame.getContentPane().add(btnMul);
			
			//----------------Row 3--------------------
			JButton btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn1.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn1.setBounds(10, 266, 57, 50);
			frame.getContentPane().add(btn1);
			
			JButton btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn2.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn2.setBounds(77, 266, 57, 50);
			frame.getContentPane().add(btn2);
			
			JButton btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn3.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn3.setBounds(142, 266, 57, 50);
			frame.getContentPane().add(btn3);
			
			JButton btnDiv = new JButton("/");
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					firstnum = Double.parseDouble(txtDisplay.getText());
					txtDisplay.setText("");
					operations = "/";
				}
			});
			btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnDiv.setBounds(204, 266, 57, 50);
			frame.getContentPane().add(btnDiv);
			
			//----------------Row 4--------------------
			JButton btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = txtDisplay.getText() + btn0.getText();
					txtDisplay.setText(EnterNumber );
				}
			});
			btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
			btn0.setBounds(10, 327, 57, 50);
			frame.getContentPane().add(btn0);
			
			JButton btnDot = new JButton(".");
			btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnDot.setBounds(77, 327, 57, 50);
			frame.getContentPane().add(btnDot);
			
			JButton btnPM = new JButton("+-");
			btnPM.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
					ops = ops * (-1);
					txtDisplay.setText(String.valueOf(ops));
				}
			});
			btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnPM.setBounds(142, 327, 57, 50);
			frame.getContentPane().add(btnPM);
			
			JButton btnEqual = new JButton("=");
			btnEqual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String answer;
					secondnum = Double.parseDouble(txtDisplay.getText());
					if (operations == "+")
					{
						result = firstnum + secondnum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
					}
					else if (operations == "-")
					{
						result = firstnum - secondnum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
					}
					else if (operations == "/")
					{
						result = firstnum / secondnum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
					}
					else if (operations == "*")
					{
						result = firstnum * secondnum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
					}
					
				}
			});
			btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnEqual.setBounds(204, 327, 57, 50);
			frame.getContentPane().add(btnEqual);
			
			
		
		
		
	}
}
