/**
 * @(#)GradeCalculator.java
 *
 *
 * @author
		Galicinao, Baron Hendrix
 * @version 1.00 2015/12/16
 */

import java.util.*;
public class GradeCalculator {
	public static void main(String[]args){	//insert comment here
		Scanner kbd = new Scanner (System.in);
		System.out.print("Enter Prelim Grade: ");
		int prelimGrade = kbd.nextInt();
		System.out.print("Enter Midterm Grade: ");
		int midtermGrade = kbd.nextInt();
		int x = (219 - (prelimGrade + midtermGrade));

		if(prelimGrade + midtermGrade + 65 >= 219){	//insert comment
			// Congratulatory message if student has passed
			System.out.print("Congratulations!!! Sure pass! You have prayed hard enough");
			System.out.print("Your standing grade is "+ (prelimGrade + midtermGrade + 65)/3 + "\nKeep up the good work!");

		}else{
			System.out.print("It seems that you need "+ x +" to pass goodluck!");
		}
	}



}