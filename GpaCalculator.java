/**
 *
 * @author Jenifer Jost 
 * Fremont, NE 
 * The second version of my Java GPA Calculator.
 * Prior versions saved as branches in GitHub. 
 */

import javax.swing.JOptionPane; // this is the input box
import java.text.DecimalFormat; // this will help format the GPA in 0.00 format
import java.math.RoundingMode; // this imports ability of .setRoundingMode to truncate the GPA

public class Secondgpacalc {

   
    public static void main(String[] args) {
        
        /* This truncates the GPA. Notice that it's imporant in a later code:
        JOptionPane.showMessageDialog(null, "Your GPA is " + df.format(sum)); */
        DecimalFormat df = new  DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.FLOOR); // this truncates, instead of rounds, the final output
        
        //This part collects, from the user, the credits associated with each grade 
        String a_grades;
        a_grades = JOptionPane.showInputDialog("# Credits earned with A grade");
        
        String b_grades;
        b_grades = JOptionPane.showInputDialog("# Credits earned with B grade");
        
        String c_grades;
        c_grades = JOptionPane.showInputDialog("# Credits earned with C grade");
        
        String d_grades;
        d_grades = JOptionPane.showInputDialog("# Credits earned with D grade");
        
        String f_grades;
        f_grades = JOptionPane.showInputDialog("# Credits earned with F grade");
        
        //This changes the input from strings into doubles
        double aGrades = Double.parseDouble(a_grades);
        double bGrades = Double.parseDouble(b_grades);
        double cGrades = Double.parseDouble(c_grades);
        double dGrades = Double.parseDouble(d_grades);
        double fGrades = Double.parseDouble(f_grades);
        
        //This parts gets the total number of credits the student has earned
        double totalCredits = aGrades + bGrades + cGrades + dGrades + fGrades;
      
        //This part gets the number of grade points the student has earned
        double gradePoints = (aGrades * 4) + (bGrades * 3) + (cGrades * 2) + (dGrades * 1) + (fGrades * 0);
        
        double sum = gradePoints / totalCredits;
        
        //This outputs the GPA, where the double sum is the answer
        JOptionPane.showMessageDialog(null, "Your GPA is " + df.format(sum));
        System.exit(0); //this makes sure values are wiped out after run.
    }
    
}
