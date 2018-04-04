// import scanner
import java.util.Scanner;

/*
 * LAB 03 - Task 5.17 - STUDENT GRADES
 * Student Name: Patricia Nellas
 * Student ID: 21503005
 * Date: 26/08/2017
 * Version: 0.1
 * Tutor: Kevin Shedlock
 */

public class StudentGrades {

	public static void main(String[] args) {
		// variables are declared
		String studentName; // variable for student name (not used therefore there are yellow lines)
		String studentGrade; // variable for student grade
		int counter = 0; // overall grade counter
		int gradeA = 0; // A-grade counter
		int gradeB = 0; // B-grade counter
		int gradeC = 0; // C-grade counter
		int gradeD = 0; // D-grade counter
		
		// instance of scanner
		Scanner input = new Scanner(System.in);
		
		// sentinel-controlled LOOP
		while (counter != 5) {
			System.out.print("Enter student name: "); // prompts for student name input
			studentName = input.next(); // assigns input value to studentName variable
			System.out.print("Enter student letter grade: "); // prompts for student letter grade
			studentGrade = input.next(); // assigned input value to studentGrade variable
			counter++; // increments counter
			
			// increments individual letter grade counters
			switch(studentGrade.toUpperCase()) {
				case "A": gradeA += 1; // increments A-grade 
				break;
				case "B": gradeB += 1; // increments B-grade
				break;
				case "C": gradeC += 1; // increments C-grade
				break;
				case "D": gradeD += 1; // increments D-grade
				break;
			} // end switch
		} // end while
		
		// prints outs the number of students that got each letter grade
		System.out.printf("%nSTUDENT GRADE COUNT:");
		System.out.printf("%n%d student(s) got an A grade.", gradeA);
		System.out.printf("%n%d student(s) got an B grade.", gradeB);
		System.out.printf("%n%d student(s) got an C grade.", gradeC);
		System.out.printf("%n%d student(s) got an D grade.", gradeD);
		
		// closes scanner
		input.close();

	} // end main

} // end class StudentGrades
