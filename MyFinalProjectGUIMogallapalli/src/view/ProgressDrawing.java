package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JComponent;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* May 2, 2022  
*/

//This class contains all elements and commands to display and change the progress bar graphic based off the user input
public class ProgressDrawing extends JComponent{

	Color correct = Color.green;
	Color clear = Color.gray;
	Color wrong = Color.red;
	
	String active = "gray";

	//This method sets the rectangle and fills it in with the colors which are set based off whether the input provided in the text fields by the user are good or bad input.
	public void paintComponent(Graphics g) {
		
		if(active.equals("gray")) {
			g.setColor(wrong);
			g.fillRect(0, 0, 0, 0);
			
			g.setColor(correct);
			g.fillRect(0, 0, 0, 0);
			
			g.setColor(clear);
			g.fillRect(0, 0, 10000, 1000);
		} else if(active.equals("green")) {
			g.setColor(wrong);
			g.fillRect(0, 0, 0, 0);
			
			g.setColor(clear);
			g.fillRect(0, 0, 0, 0);
			
			g.setColor(correct);
			g.fillRect(0, 0, 10000, 1000);
		} else {
			g.setColor(correct);
			g.fillRect(0, 0, 0, 0);
			
			g.setColor(clear);
			g.fillRect(0, 0, 0, 0);
			
			g.setColor(wrong);
			g.fillRect(0, 0, 10000, 1000);	
		}
		
	}
	
	//This method changes the color of the progress bar from whichever color it was at to red when the user enters invalid input
	public void incorrect() {
		correct = Color.gray;
		clear = Color.gray;
		wrong = Color.gray;
		if(active.equals("gray")) {
			active = "red";
			wrong = Color.red;
		} else if(active.equals("green")) {
			active = "red";
			wrong = Color.red;
		} else {
			active = "red";
			wrong = Color.red;
		}
		repaint();
	}
	//This method changes the color of the progress bar from whichever color it was at to green when the user enters valid input
	public void correct() {
		correct = Color.gray;
		clear = Color.gray;
		wrong = Color.gray;
		if(active.equals("gray")) {
			active = "green";
			correct = Color.green;
		} else if(active.equals("red")) {
			active = "green";
			correct = Color.green;
		} else {
			active = "green";
			correct = Color.green;
		}
		repaint();
	}
	//This method changes the color of the progress bar from whichever color it was at to red when the user enters clears or at the start off the program
	public void clear() {
		correct = Color.gray;
		clear = Color.gray;
		wrong = Color.gray;
		if(active.equals("green")) {
			active = "gray";
			wrong = Color.gray;
		} else if(active.equals("red")) {
			active = "gray";
			wrong = Color.gray;
		} else {
			active = "gray";
			wrong = Color.gray;
		}
		repaint();
		
	}

}
