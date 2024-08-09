import java.util.Scanner;

public class GradeStatistics {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int classCount = 10;
		double[] classGrade = new double[classCount];
		double sumGrade = 0.0;
		double avgGrade;
		double maxGrade = Double.MIN_VALUE;  // Sets maximum Grade to the lowest possible value of double
		double minGrade = Double.MAX_VALUE;  // Sets minimum Grade to the highest possible value of double
		
		// Reading Grade 
		for (int i=0; i < classCount; ++i) {
			System.out.print("Enter grade of Student " +(i+1) + ":");
			
			if (!scnr.hasNextDouble() && !scnr.hasNextInt()) {
				System.out.println("Invalid Input. Restart");
				scnr.next();
				i-- ;
				continue;
			}
			
			// Convert to Double
			if (scnr.hasNextDouble()) 
				classGrade[i] = scnr.nextDouble();
			else if (scnr.hasNextInt())
				classGrade[i] = (double) scnr.nextInt();
			
			// Re entering Negative grades entered
			if (classGrade[i] < 0) {
				System.out.println("Negative grades not allowed. Re-enter");
				i-- ;
				continue;
			}
			
			// Calculate Sum of all grades
			sumGrade = sumGrade + classGrade[i];
			
			// Determine Max Grade
			if (classGrade[i] > maxGrade)
				maxGrade = classGrade[i];
			
			// Determine Min Grade
			if (classGrade[i] < minGrade)
				minGrade = classGrade[i];
		}	
		
		// Calculate Average
		avgGrade = sumGrade / classCount;
		
		// Class Grade Display
		System.out.println("\nGrade of " + classCount + " Students are:\n" );
		for (int i=0; i < classCount; ++i) {
			System.out.print("\t" + classGrade[i]);
		}
		
		// Class Statistics Display
		System.out.println("\nClass Grade Statistics is as follows:");
		System.out.println("Average Grade:" + avgGrade);
		System.out.println("Maximum Grade:" + maxGrade);
		System.out.println("Minimum Grade:" + minGrade);
		
		scnr.close();
	}
}