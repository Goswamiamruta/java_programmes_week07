package homework_week_7;

import java.util.Scanner;

/**
 * 1. Write a java programthat tell us that input number is odd or even?
 * Hint:use ternary operator
 */

public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number =scanner.nextInt();
        isItOddOrEvenNumber(number);
        scanner.close();

    }
//checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        String evenOrOdd = (number % 2 == 0)?"Even":"Odd";
        System.out.println("The "+number + "is" + evenOrOdd + ".");
    }

}
