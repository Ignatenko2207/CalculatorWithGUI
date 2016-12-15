package myPackage.info;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.Color;

public class CalcWindow extends JFrame{
	private JTextField textField;
	private boolean firstClick = true;
	private boolean pointInputed = false;
	private String firstNumber;
	private boolean percentInputed = false; 
	private String operation; 
	
	public CalcWindow(String title){
		
		super.setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(319, 287);
		setResizable(false);
		getContentPane().setLayout(null);
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setText("0");
		textField.setBounds(10, 11, 290, 30);
		getContentPane().add(textField);
		
		JButton buttonC = new JButton("C");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("C");
			}			
		});
		buttonC.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonC.setBounds(190, 52, 110, 30);
		getContentPane().add(buttonC);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("1");
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button1.setBounds(10, 93, 50, 30);
		getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("2");
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button2.setBounds(70, 93, 50, 30);
		getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("3");
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button3.setBounds(130, 93, 50, 30);
		getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("4");
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button4.setBounds(10, 134, 50, 30);
		getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("5");
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button5.setBounds(70, 134, 50, 30);
		getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("6");
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button6.setBounds(130, 134, 50, 30);
		getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("7");
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button7.setBounds(10, 175, 50, 30);
		getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("8");
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button8.setBounds(70, 175, 50, 30);
		getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("9");
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button9.setBounds(130, 175, 50, 30);
		getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("0");
			}
		});
		button0.setFont(new Font("Tahoma", Font.BOLD, 15));
		button0.setBounds(10, 216, 50, 30);
		getContentPane().add(button0);
			
		JButton buttonPoint = new JButton(".");
		buttonPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField(".");
			}
		});
		buttonPoint.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonPoint.setBounds(70, 216, 50, 30);
		getContentPane().add(buttonPoint);
		
		JButton buttonPlusOrMinus = new JButton("+/-");
		buttonPlusOrMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("+/-");
			}
		});
		buttonPlusOrMinus.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buttonPlusOrMinus.setBounds(130, 216, 50, 30);
		getContentPane().add(buttonPlusOrMinus);
		
		
		//Actions for result
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("+");
			}
		});
		buttonPlus.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonPlus.setBounds(190, 93, 50, 30);
		getContentPane().add(buttonPlus);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("-");
			}
		});
		buttonMinus.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonMinus.setBounds(190, 134, 50, 30);
		getContentPane().add(buttonMinus);
		
		JButton buttonMult = new JButton("x");
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("x");
			}
		});
		buttonMult.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonMult.setBounds(190, 175, 50, 30);
		getContentPane().add(buttonMult);
		
		JButton buttonDiv = new JButton("/");
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("/");
			}
		});
		buttonDiv.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonDiv.setBounds(190, 216, 50, 30);
		getContentPane().add(buttonDiv);
		
		JButton buttonPercent = new JButton("%");
		buttonPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("%");
			}
		});
		buttonPercent.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonPercent.setBounds(250, 93, 50, 30);
		getContentPane().add(buttonPercent);
		
		//Result
		JButton buttonResult = new JButton("=");
		buttonResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTextInField("res");
			}
		});
		buttonResult.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonResult.setBounds(250, 134, 50, 112);
		getContentPane().add(buttonResult);
		
		setVisible(false);
		setVisible(true);
	}

	protected void showTextInField(String inputedString) {
		String numberInField = textField.getText();
		if (numberInField.length()>17 && inputedString!="C") {
			return;
		}
			
		if (inputedString=="C") {
			firstNumber = null;
			operation = null;
			setPercent(false);
			setFirstClick(true);
			setPoint(false);
			textField.setText("0");
			return;
		}
		
		if (inputedString=="+/-") {
			if(firstClick){
				textField.setText("0");
				setFirstClick(false);
				setPoint(false);
			} else{
				String changedString = changeMinus(numberInField);
				textField.setText(changedString);
				setFirstClick(false);
			}
		}
		if (inputedString==".") {
			if(firstClick){
				textField.setText("0.");
				setFirstClick(false);
				setPoint(true);
			} else{
				String stringInField = textField.getText();
				if(pointInputed){
					textField.setText(stringInField);
					setPoint(true);		
					setFirstClick(false);
				} else {
					textField.setText(stringInField+=".");	
					setPoint(true);
					setFirstClick(false);
				}
			}		
			
		}
		
		char inputedNumber = inputedString.charAt(0);
		if (Character.isDigit(inputedNumber)) {
			if(firstClick){
				textField.setText(inputedString);
				setFirstClick(false);
				setPoint(false);
			} else{
				String stringInField = textField.getText();
				textField.setText(stringInField+=inputedString);	
				setFirstClick(false);
			}
		}
		
		if(inputedString == "+"){
			if(firstClick){
				return;
			} else{
				firstNumber = numberInField;
				operation = inputedString;
				setFirstClick(true);
				textField.setText("0");
			}
		}
		
		if(inputedString == "-"){
			if(firstClick){
				return;
			} else{
				firstNumber = numberInField;
				operation = inputedString;
				setFirstClick(true);
				textField.setText("0");
			}
		}
		
		if(inputedString == "x"){
			if(firstClick){
				return;
			} else{
				firstNumber = numberInField;
				operation = inputedString;
				setFirstClick(true);
				textField.setText("0");
			}
		}
		
		if(inputedString == "/"){
			if(firstClick){
				return;
			} else{
				firstNumber = numberInField;
				operation = inputedString;
				setFirstClick(true);
				textField.setText("0");
			}
		}
		
		if(inputedString == "%"){
			if(firstNumber == null && operation == null){
				return;
			} else{
				setPercent(true);
				double number1 = Double.parseDouble(firstNumber);
				double number2 = Double.parseDouble(numberInField);
				BigDecimal num1 = BigDecimal.valueOf(number1);
				BigDecimal num2 = BigDecimal.valueOf(number2);
				num1=num1.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
				num1=num1.multiply(num2);
				String resultString = String.valueOf(num1);
				textField.setText(resultString);
			}
		}
		
		if (inputedString == "res") {
			if (firstNumber != null && operation != null) {
				if (numberInField.contains(".") || firstNumber.contains(".")) {
					int lengthAfterPoint = getLengthAfterPoint(firstNumber, numberInField);
					double number1 = Double.parseDouble(firstNumber);
					double number2 = Double.parseDouble(numberInField);
					BigDecimal num1 = BigDecimal.valueOf(number1);
					BigDecimal num2 = BigDecimal.valueOf(number2);
					
					switch (operation) {
					case "+": num1 = num1.add(num2);			
						break;
					case "-": num1 = num1.subtract(num2);				
						break;
					case "x": num1 = num1.multiply(num2);				
						break;
					case "/": num1 = num1.divide(num2, lengthAfterPoint, RoundingMode.HALF_UP);				
						break;
					default:
					}
					String resultString = String.valueOf(num1);
					textField.setText(resultString);
				} else{
					long number1 = Long.parseLong(firstNumber);
					long number2 = Long.parseLong(numberInField);
					BigDecimal num1 = BigDecimal.valueOf(number1);
					BigDecimal num2 = BigDecimal.valueOf(number2);
					
					switch (operation) {
					case "+": num1 = num1.add(num2);			
						break;
					case "-": num1 = num1.subtract(num2);				
						break;
					case "x": num1 = num1.multiply(num2);				
						break;
					case "/": 
						if(number1 % number2==0){
							num1 = num1.divide(num2);				
						} else{
							double doubleNum1 = Double.parseDouble(firstNumber);
							double doubleNum2 = Double.parseDouble(numberInField);
							double resultAsDouble = doubleNum1/doubleNum2;
							num1 = BigDecimal.valueOf(resultAsDouble);
						}
						break;
					default:
					}
					String resultString = String.valueOf(num1);
					textField.setText(resultString);
					
				}
				setPercent(false);
			} else{
				return;
			}
		}
	}

	private void setPercent(boolean persent) {
		percentInputed = persent;
	}

	private int getLengthAfterPoint(String num1, String num2) {
		int lengthAfterPoint=0;
		int count = 0;
		if (num1.contains(".")) {
			char[] symbolsInNum1 = num1.toCharArray();
			for (int i = 0; i < symbolsInNum1.length; i++) {
				if(Character.valueOf(symbolsInNum1[i]) == '.'){
					count = (symbolsInNum1.length - 1) -i;
					lengthAfterPoint += count;
				}
			}
		}
		if (num2.contains(".")) {
			char[] symbolsInNum2 = num2.toCharArray();
			for (int i = 0; i < symbolsInNum2.length; i++) {
				if(Character.valueOf(symbolsInNum2[i]) == '.'){
					count = (symbolsInNum2.length - 1) -i;
					lengthAfterPoint += count;
				}
			}
		}
		
		return lengthAfterPoint;
	}

	protected String changeMinus(String inputedString) {
		String changedString;
		if(inputedString.contains(".")){
			double number = Double.parseDouble(inputedString)*(-1);
			changedString = String.valueOf(number);
		} else{
			long number = Long.parseLong(inputedString)*(-1);
			changedString = String.valueOf(number);
		}		
		return changedString;
	}

	public void setPoint(boolean point) {
		pointInputed = point;
	}

	public void setFirstClick(boolean click) {
		firstClick = click;
	}
	public JTextField getTextField() {
		return textField;
	}
}
