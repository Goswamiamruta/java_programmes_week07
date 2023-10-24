package homework_week_7;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary
 * 20% Gross salary = basic salary + HRA + TA + DA –PF
 */
public class Programme_5_SalarySlip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Employee Name:");
        String employeeName = scanner.nextLine();
        System.out.println("Enter Basic Salary:");
        double basicSalary = scanner.nextDouble();

        double hra = 0.10 * basicSalary;
        double ta = 0.09 * basicSalary;
        double da = 0.08 * basicSalary;
        double pf = 0.20 * basicSalary;
        double grossSalary = basicSalary + hra + ta + da - pf;

        System.out.println("_____________________________");
        System.out.println("|         Salary Slip         |");
        System.out.println("|______________________________|");
        System.out.println("| Employee ID : " + employeeId + "    |");
        System.out.println("| Employee Name : " + employeeName + " |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary : " + basicSalary + "  |");
        System.out.println("| HRA 10% : " + hra + "             |");
        System.out.println("| TA 8% : " + ta + "               |");
        System.out.println("| DA 9% : " + da + "               |");
        System.out.println("| PF - 20% : " + pf + "            |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary : " + grossSalary + "   |");
        System.out.println("|=============================|");

        scanner.close();
    }
}
