import javax.swing.*;
import java.awt.event.ActionEvent;


public class Student {
    private JTextField txtStudentName;
    private JButton calculateButton;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAverage;
    private JTextField txtGrade;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        // Warning Anonymous new ActionListener() can be replaced with lambda with below fix
        calculateButton.addActionListener((ActionEvent e) -> {

            int marks1, marks2, marks3;
            int total;

            String studentName = txtStudentName.getText();
            txtStudentName.setText(studentName);

            String grade;

            marks1 = Integer.parseInt(txtMarks1.getText());
            marks2 = Integer.parseInt(txtMarks2.getText());
            marks3 = Integer.parseInt(txtMarks3.getText());

            total = marks1 + marks2 + marks3;
            txtTotal.setText(String.valueOf(total));

            double average = total / 3.0;
            txtAverage.setText(String.valueOf(average));

            if (average > 65) grade = "PASS";
            else grade = "FAIL";

            txtGrade.setText(grade);

        });
    }
}
