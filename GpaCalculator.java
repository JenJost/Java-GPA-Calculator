import java.util.Scanner; // this allows users to enter information
import java.text.DecimalFormat; // this will help format the GPA in 0.00 format.

public class MyGpaCalculator {  

    public static void main(final String[] args) {
    
    /* Notice that creating df is imporant in  later code:
      System.out.println("Your GPA is " + df.format(sum)); 
      Note also that this rounds the decimals instead of truncates. Will want to fix this later. */
    DecimalFormat df = new  DecimalFormat("0.00");
    
    /* The Scanner constructor requires an input stream 
    object as an argument. gpaScanner is an identifer and variable. */
    Scanner gpaScanner = new Scanner ( System.in ); 
    
    //This part prompts the user for number of credits associated with each grade. 
    System.out.print("Number of credits earned with A grade: ");
      double aGrades = gpaScanner.nextDouble();
    System.out.print("Number of credits earned with B grade: ");
      double bGrades = gpaScanner.nextDouble();
    System.out.print("Number of credits earned with C grade: ");
      double cGrades = gpaScanner.nextDouble();
    System.out.print("Number of credits earned with D grade: ");
      double dGrades = gpaScanner.nextDouble();
    System.out.print("Number of credits earned with F grade: ");
      double fGrades = gpaScanner.nextDouble();
     
    //This parts gets the total number of credits the student has earned
      double totalCredits = aGrades + bGrades + cGrades + dGrades + fGrades;
      
    //This part gets the number of grade points the student has earned
        double gradePoints = (aGrades * 4) + (bGrades * 3) + (cGrades * 2) + (dGrades * 1) + (fGrades * 0);
        
        double sum = gradePoints / totalCredits;
    
    System.out.println("Your GPA is " + df.format(sum));
    
    }
}

