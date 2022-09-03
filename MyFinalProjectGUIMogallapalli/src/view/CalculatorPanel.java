package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Calculator;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* May 2, 2022  
*/

//This class instantiates and contains elements for the JPanel and ActionListeners respectively. These are then shown and called in the main method of the CalculatorStart Program to be shown to the user.
public class CalculatorPanel extends JPanel{
	private JLabel title = new JLabel("      Complex Calculator      ");
	private JLabel startingText = new JLabel("Starting Value: ");
	private JLabel factorText = new JLabel("Factor: ");
	private JLabel timesText = new JLabel("Number of Times: ");
	private JLabel totalText = new JLabel("Total: ");
	private JTextField startingField = new JTextField(5);
	private JTextField factorField = new JTextField(5);
	private JTextField timesField = new JTextField(5);
	private JTextField totalField = new JTextField(5);
	private JButton addButton = new JButton("Add"); 
	private JButton subtractButton = new JButton("Subtract");
	private JButton multiplyButton = new JButton("Multiply"); 
	private JButton divideButton = new JButton("Divide");
	private JButton clearButton = new JButton("Clear");

	ProgressDrawing progressBar = new ProgressDrawing();
	
	//instantiates listeners and add components to JPanel
	public CalculatorPanel() {
		super();
		
		add(title);
		add(startingText);
		add(startingField);
		add(factorText);
		add(factorField);
		add(timesText);
		add(timesField);
		
		AddButtonListener additionButtonListener = new AddButtonListener();
		addButton.addActionListener(additionButtonListener);
		
		SubtractButtonListener subtractionButtonListener = new SubtractButtonListener();
		subtractButton.addActionListener(subtractionButtonListener);
		
		MultiplyButtonListener multiplicationButtonListener = new MultiplyButtonListener();
		multiplyButton.addActionListener(multiplicationButtonListener);
		
		DivideButtonListener divisionButtonListener = new DivideButtonListener();
		divideButton.addActionListener(divisionButtonListener);
		
		ClearButtonListener clearButtonListener = new ClearButtonListener();
		clearButton.addActionListener(clearButtonListener);
		
		progressBar.setPreferredSize(new Dimension(260, 16));
		
		add(addButton);
		add(subtractButton);
		add(multiplyButton);
		add(divideButton);
		add(progressBar);
		add(totalText);
		add(totalField);
		add(clearButton);
	}
	//ActionListener that notes when a user presses the add button and takes the values entered in the three text fields and supplies them to the addTotal method in the Calculator program. This method also validates input to ensure that the values entered are valid. If invalid it sets the progress bar from ProgressDrawing to red else green.
	class AddButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
				double startNumber = Double.parseDouble(startingField.getText());
				double factorNumber = Double.parseDouble(factorField.getText());
				double timesNumber = Double.parseDouble(timesField.getText());
				if(timesNumber>=0) {
					Calculator complexCalculator = new Calculator();
					Double complexCalculatorTotal = complexCalculator.addTotal(startNumber, factorNumber, timesNumber);;
					totalField.setText(complexCalculatorTotal.toString());
					progressBar.correct();	
				} else {
					progressBar.incorrect();
				}
			
			} catch (NumberFormatException ex) {
				// TODO Auto-generated catch block
				progressBar.incorrect();
			}
		}
	}
	//ActionListener that notes when a user presses the subtract button and takes the values entered in the three text fields and supplies them to the subtractTotal method in the Calculator program. This method also validates input to ensure that the values entered are valid. If invalid it sets the progress bar from ProgressDrawing to red else green.
	class SubtractButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				double startNumber = Double.parseDouble(startingField.getText());
				double factorNumber = Double.parseDouble(factorField.getText());
				double timesNumber = Double.parseDouble(timesField.getText());
				if(timesNumber>=0) {
					Calculator calc = new Calculator();
					Double calcTotal = calc.subTotal(startNumber, factorNumber, timesNumber);
					
					totalField.setText(calcTotal.toString());	
					progressBar.correct();
				} else {
					progressBar.incorrect();
				}

			}catch(Exception ex) {
				progressBar.incorrect();
			}
		}
	}
	//ActionListener that notes when a user presses the multiply button and takes the values entered in the three text fields and supplies them to the multiplyTotal method in the Calculator program. This method also validates input to ensure that the values entered are valid. If invalid it sets the progress bar from ProgressDrawing to red else green.
	class MultiplyButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				double startNumber = Double.parseDouble(startingField.getText());
				double factorNumber = Double.parseDouble(factorField.getText());
				double timesNumber = Double.parseDouble(timesField.getText());
				if(timesNumber>=0) {
					Calculator calc = new Calculator(startNumber,factorNumber,timesNumber);
					
					Double calcTotal = calc.multiplyTotal(startNumber, factorNumber, timesNumber);
					
					totalField.setText(calcTotal.toString());
					progressBar.correct();					
				}else {
					progressBar.incorrect();
				}

			}catch(Exception ex) {
				progressBar.incorrect();
			}
		}
	}
	//ActionListener that notes when a user presses the divide button and takes the values entered in the three text fields and supplies them to the divideTotal method in the Calculator program. This method also validates input to ensure that the values entered are valid. If invalid it sets the progress bar from ProgressDrawing to red else green.
	class DivideButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				double startNumber = Double.parseDouble(startingField.getText()); 
				double factorNumber = Double.parseDouble(factorField.getText()); 
				double timesNumber = Double.parseDouble(timesField.getText()); 
				if(timesNumber>=0) {
					Calculator calc = new Calculator(startNumber,factorNumber,timesNumber);
					
					Double calcTotal = calc.divideTotal(startNumber, factorNumber, timesNumber);
					
					totalField.setText(calcTotal.toString());
					progressBar.correct();	
				}else {
					
					progressBar.incorrect();
				}
			}catch(Exception ex) {
				progressBar.incorrect();
			}
		}
	}
	//ActionListener that notes when a user presses the clear button and resets the text fields to the default values which are empty strings and resets the progress bar to display gray/neutral.
	class ClearButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			resetFields();
			progressBar.clear();
		}
	}
	//Method that supplies the default values for the ActionListener to reset the text fields to when a user presses the clear button.
	public void resetFields() {
		startingField.setText("");
		factorField.setText("");
		timesField.setText("");
		totalField.setText("");
	}

	
}
