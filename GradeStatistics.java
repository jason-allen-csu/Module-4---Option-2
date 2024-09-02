import java.util.Scanner;
public class GradeStatistics {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		double sumGrade = 0.0;
		double avgGrade;
		double maxGrade = Double.MIN_VALUE;  // Sets maximum Grade to the lowest possible value of double
		double minGrade = Double.MAX_VALUE;  // Sets minimum Grade to the highest possible value of double
		
		// Reading Grade 
		for (int i=0; i < 10; ++i) {
			System.out.print("Enter grade of Student " +(i+1) + ":");
			
			if (!scnr.hasNextDouble() && !scnr.hasNextInt()) {
				System.out.println("Invalid Input. Restart");
				scnr.next();
				i-- ;
				continue;
			}
			
			double grade = scnr.nextDouble();			
			
			// Re entering Negative grades entered
			if (grade < 0) {
				System.out.println("Negative grades not allowed. Re-enter");
				i-- ;
				continue;
			}
			
			// Calculate Sum of all grades
			sumGrade = sumGrade + grade;
			
			// Determine Max Grade
			if (grade > maxGrade)
				maxGrade = grade;
			
			// Determine Min Grade
			if (grade < minGrade)
				minGrade = grade;
		}	
		// Calculate Average
		avgGrade = sumGrade / 10;
		
		// Class Statistics Display
		System.out.println("\nClass Grade Statistics is as follows:");
		System.out.println("Average Grade:" + avgGrade);
		System.out.println("Maximum Grade:" + maxGrade);
		System.out.println("Minimum Grade:" + minGrade);
		
		scnr.close();
	}
}