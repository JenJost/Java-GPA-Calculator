/**
 *
 * @author Jenifer Jost 
 * Fremont, NE 
 * The current (master) version of my GPA calculator.
 * Prior versions saved as GitHub branches. 
 */
 
 //This version uses JFrame to allow multiple inputs in one window, 
 //then returns answer in a JOptionPane


package gpacalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat; 
import java.math.RoundingMode; 


public abstract class GpaCalc extends JFrame implements ActionListener {

    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("GPA Calculator");
        frame.setVisible(true);
        frame.setSize(300,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JLabel aGrades = new JLabel("# Credits earned with A grade:");
            JTextField a_Grades = new JTextField(3);
        JLabel bGrades = new JLabel("# Credits earned with B grade:");
            JTextField b_Grades = new JTextField(3);    
        JLabel cGrades = new JLabel("# Credits earned with C grade:");
            JTextField c_Grades = new JTextField(3);
        JLabel dGrades = new JLabel("# Credits earned with D grade:");
            JTextField d_Grades = new JTextField(3);
        JLabel fGrades = new JLabel("# Credits earned with F grade:");
            JTextField f_Grades = new JTextField(3);
            
        panel.add(aGrades);
        panel.add(a_Grades);
        panel.add(bGrades);
        panel.add(b_Grades);
        panel.add(cGrades);
        panel.add(c_Grades);
        panel.add(dGrades);
        panel.add(d_Grades);
        panel.add(fGrades);
        panel.add(f_Grades);
        
        JButton submit = new JButton("Submit");
        panel.add(submit);
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String gradesOfA = a_Grades.getText();
                double aGrade = Double.parseDouble(gradesOfA);
                String gradesOfB = b_Grades.getText();
                double bGrade = Double.parseDouble(gradesOfB);
                String gradesOfC = c_Grades.getText();
                double cGrade = Double.parseDouble(gradesOfC);
                String gradesOfD = d_Grades.getText();
                double dGrade = Double.parseDouble(gradesOfD);
                String gradesOfF = f_Grades.getText();
                double fGrade = Double.parseDouble(gradesOfF);
                
                double totalCredits = aGrade + bGrade + cGrade + dGrade + fGrade;
      
                
                double gradePoints = (aGrade * 4) + (bGrade * 3) + (cGrade * 2) + (dGrade * 1) + (fGrade * 0);
        
                double sum = gradePoints / totalCredits;
                
                DecimalFormat df = new  DecimalFormat("0.00");
                df.setRoundingMode(RoundingMode.FLOOR); 
                JOptionPane.showMessageDialog(null, "Your GPA is " + df.format(sum));
                System.exit(0); 
            }
        });
    }
    
 
    
    
    }
