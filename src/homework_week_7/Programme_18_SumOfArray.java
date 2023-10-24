package homework_week_7;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme_18_SumOfArray {

    public static void main(String[] args) {
        int[] numericArray = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int num : numericArray) {
            sum += num;
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}

