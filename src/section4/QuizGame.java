package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
String question_one = JOptionPane.showInputDialog("What is 1 + 1");	
		// 3.  Use an if statement to check if their answer is correct
		if (question_one.equals ("2")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}
		// 4.  if the user's answer is correct
		if (question_one.equals ("2")) {
			score = score + 1;
		}
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String question_two = JOptionPane.showInputDialog("What is 110/5 ");
		
		if (question_two.equals("22")) {
			JOptionPane.showMessageDialog(null, "Correct");
		if( question_two.equals("22")) {
			score = score + 1;
		}
		}
		
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null,"Your score is" + score +"/2"  );
	}
}
