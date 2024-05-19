package week06;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
	private JPanel panel1;
	private JPanel panel2;
	private JTextField field;
	private JButton[] button1;
	private JButton[] button2;
	private String[] labels1 = { "Backspace", "CE", "C" };
	private String[] labels2 = { "7", "8", "9", "/", "sqrt", "4", "5", "6", "*", "%", "1", "2", "3", "-", "1/x", "0",
			"+/-", ".", "+", "=" };

	private double result = 0;
	private String operator = "=";
	private boolean startOfNumber = true;
	
	public Calculator() {
		setTitle("MyCalculator");
		field = new JTextField(35);
		field.setText("");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel1.setLayout(new GridLayout(1, 3, 7, 7));
		panel2.setLayout(new GridLayout(4, 5, 7, 7));
		button1 = new JButton[3];
		int index = 0;
		for (int rows = 0; rows < 1; rows++) {
			for (int cols = 0; cols < 3; cols++) {
				button1[index] = new JButton(labels1[index]);
				button1[index].setForeground(Color.RED);
				button1[index].addActionListener(this);
				panel1.add(button1[index]);
				index++;
			}
		}
		button2 = new JButton[20];
		int index2 = 0;
		for (int rows = 0; rows < 4; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				button2[index2] = new JButton(labels2[index2]);
				button2[index2].addActionListener(this);
				if (index2 == 3 || index2 == 8 || index2 == 13 || index2 == 18 || index2 == 19) {
					button2[index2].setForeground(Color.RED);
				}
				panel2.add(button2[index2]);
				index2++;
			}
		}
		add(field, BorderLayout.NORTH);
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		setVisible(true);
		pack();
	}
	
	public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("C")) {
            field.setText("");
            result = 0;
            operator = "=";
            startOfNumber = true;
        } else if (command.equals("CE")) {
            field.setText("");
            startOfNumber = true;
        } else if (command.equals("Backspace")) {
            String text = field.getText();
            if (text.length() > 0) {
                field.setText(text.substring(0, text.length() - 1));
            }
        } else if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            if (startOfNumber) {
                field.setText(command);
                startOfNumber = false;
            } else {
                field.setText(field.getText() + command);
            }
        } else {
            if (startOfNumber) {
                if (command.equals("-")) {
                    field.setText(command);
                    startOfNumber = false;
                }else {
                    operator = command;
                }
            } else {
                double x = Double.parseDouble(field.getText());
                calculate(x);
                operator = command;
                startOfNumber = true;
            }
        }
    }
	
	private void calculate(double n) {
		if(operator.equals("+"))
			result+=n;
		else if(operator.equals("-"))
			result-=n;
		else if (operator.equals("*"))
			result*=n;
		else if (operator.equals("/"))
			result/=n;
		else if (operator.equals("="))
			result=n;
		else if (operator.equals("%"))
			result%=n;
		else if (operator.equals("sqrt")) {
			result=Math.sqrt(n);
		}
		else if (operator.equals("1/x")) {
            result = 1 / n;
        }
		field.setText(" "+result);
	}


	public static void main(String[] args) {
		Calculator c = new Calculator();
	}
}