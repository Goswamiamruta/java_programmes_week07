package homework_week_7;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme_19_AverageOfArray {
    public static void main(String[] args) {
        int[] numericArray = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int num : numericArray) {
            sum += num;
        }

        double average = (double) sum / numericArray.length;

        System.out.println("The average of the array elements is: " + average);
    }
}
