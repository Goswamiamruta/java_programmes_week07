package homework_week_7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol
 */
public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value:");
        char ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The input is a alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("The input is an number.");
        } else {
            System.out.println(ch + "The input is a symbol.");
        }
        scanner.close();
    }


}

