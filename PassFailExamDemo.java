package week9;

import java.swing.PassFailExam;

import javax.swing.JOptionPane;



public class PassFailExamDemo {
    public static void main(String[] args) {
        String input;
        int questions;
        int missed;
        double minPassing;

        // Get number of questions on the exam
        input = JOptionPane.showInputDialog("How many questions are on the exam?");
        questions = Integer.parseInt(input);

        // Get number of questions missed
        input = JOptionPane.showInputDialog("How many questions did the student miss?");
        missed = Integer.parseInt(input);

        // Get minimum passing score
        input = JOptionPane.showInputDialog("What is the minimum passing score?");
        minPassing = Double.parseDouble(input);

  
        PassFailExam exam = new PassFailExam(questions, missed, minPassing);
        
        String message = "Each question counts " + exam.getPointsEach() + " points.\n"
                       + "The exam score is " + exam.getScore() + "\n"
                       + "The exam grade is " + exam.getGrade();

    
        JOptionPane.showMessageDialog(null, message);

                System.exit(0);
    }
}