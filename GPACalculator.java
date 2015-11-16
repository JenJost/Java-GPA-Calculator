package gpacalculator;

import java.math.RoundingMode;
import java.text.DecimalFormat; 
import java.awt.*; // ActionListener is defined in this package
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; // this includes the JFrame
import javax.swing.event.*; 

public class GpaCalculator {

    
    public static void main(String[] args) {
      
        JFrame frame = new JFrame("GPA Calculator"); 
        frame.setVisible(true);
        frame.setSize(300,250); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        JLabel aGradesLabel = new JLabel("# credits earned with A grade: ");
        JTextField aGradesText = new JTextField(3); 
        JLabel bGradesLabel = new JLabel("# credits earned with B grade: ");
        JTextField bGradesText = new JTextField(3);
        JLabel cGradesLabel = new JLabel("# credits earned with C grade: ");
        JTextField cGradesText = new JTextField(3); 
        JLabel dGradesLabel = new JLabel("# credits earned with D grade: ");    
        JTextField dGradesText = new JTextField(3);
        JLabel fGradesLabel = new JLabel("# credits earned with F grade: ");
        JTextField fGradesText = new JTextField(3); 

        JButton submit = new JButton("Submit");
        
        JPanel panel = new JPanel();
        frame.add(panel);
        Component add = panel.add(aGradesLabel);
        Component add1 = panel.add(aGradesText);
        Component add2 = panel.add(bGradesLabel);
        Component add3 = panel.add(bGradesText);
        Component add4 = panel.add(cGradesLabel);
        Component add5 = panel.add(cGradesText);
        Component add6 = panel.add(dGradesLabel);
        Component add7 = panel.add(dGradesText);
        Component add8 = panel.add(fGradesLabel);
        Component add9 = panel.add(fGradesText);
        Component add10 = panel.add(submit);
       
   
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                //This converts input from JText Fields into doubles
                String aGrades = aGradesText.getText();
                double aNumber = Double.parseDouble(aGrades);
                String bGrades = bGradesText.getText();
                double bNumber = Double.parseDouble(bGrades);
                String cGrades = cGradesText.getText();
                double cNumber = Double.parseDouble(cGrades);
                String dGrades = dGradesText.getText();
                double dNumber = Double.parseDouble(dGrades);
                String fGrades = fGradesText.getText();
                double fNumber = Double.parseDouble(fGrades);
               
                //This parts gets the total number of credits the student has earned
                double totalCredits = aNumber + bNumber + cNumber + dNumber + fNumber;
                
                //This part gets the number of grade points the student has earned
                double gradePoints = (aNumber * 4) + (bNumber * 3) + (cNumber * 2) + (dNumber * 1) + (fNumber * 0);
                
                double sum = gradePoints / totalCredits;
                
                /* This truncates the GPA. Notice that it's imporant in a later code:
                JOptionPane.showMessageDialog(null, "Your GPA is " + df.format(sum)); */
                DecimalFormat df = new  DecimalFormat("0.00");
                df.setRoundingMode(RoundingMode.FLOOR); // this truncates, instead of rounds, the final output
                
                //This outputs the GPA, where the double sum is the answer
                System.out.println("Your GPA is " + df.format(sum));
                System.exit(0); //this makes sure values are wiped out after run.
              
            }
        }}
}
