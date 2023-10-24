package homework_week_7;
/**
 * Write a java program to input student Name, roll No, and three subjects Math,
 * Science and English marks (marks is between0 to 100 and if it is out of range
 * print error message Invalid Input, Marks should between0 to 100)
 * and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade
 * if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following
 */

import java.util.Scanner;

public class Programme_3_MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name:");
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number:");
        int rollNo = scanner.nextInt();
        //Input marks for Math, Science,and English
        System.out.print("Enter Math marks (0-100):");
        int mathMarks = scanner.nextInt();
        System.out.print("Enter Science marks (0-100):");
        int scienceMarks = scanner.nextInt();
        System.out.print("Enter English marks (0-100):");
        int englishMarks = scanner.nextInt();
        scanner.close();
        //Check if marks are in the valid range
        if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
            System.out.println("invalid input .Marks should be between 0 to 100.");
        } else {
            //Calculate total and percentage
            int totalMarks = mathMarks + scienceMarks + englishMarks;
            double percentage = (totalMarks / 300.0) * 100;
            //Determine pass or fail
            String result = (percentage >= 35) ? "Pass" : "Fail";
            String grade;
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "c";
            } else {
                grade = "D";
            }
            //print the Mark sheet
            System.out.println("----------------------------");
            System.out.println("|                         |");
            System.out.println("|        Mark Sheet       |");
            System.out.println("---------------------------");
            System.out.println("| Name :  " + name + "       |");
            System.out.println("| Roll No : " + rollNo + "      |");
            System.out.println("|--------------------------");
            System.out.println("| Subjects : Marks       |");
            System.out.println("|_________________________|");
            System.out.println("| Math : " + mathMarks + "      |");
            System.out.println("| Science : " + scienceMarks + "  |");
            System.out.println("| English : " + englishMarks + "  |");
            System.out.println("|_________________________|");
            System.out.println("| Total : " + totalMarks + "      |");
            System.out.println("|_________________________|");
            System.out.println("| Percentage : " + percentage + " |");
            System.out.println("| Result : " + result + "      |");
            System.out.println("| Grade : " + grade + "       |");
            System.out.println("|_________________________|");
        }


    }
}
