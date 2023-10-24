package homework_week_7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17_SortArray {
    public static void main(String[] args) {
        //Approach 1
        int[] numericArray = {1, 2, 3, 4, 5,};

        //Approach 2
        String[] stringsArray = {"Apple", "Banana","Orange","Papaya"};
        Arrays.toString(numericArray);
        Arrays.toString(stringsArray);

        System.out.println(Arrays.toString(numericArray));
        System.out.println(Arrays.toString(stringsArray));

        Arrays.sort(numericArray);
        Arrays.sort(stringsArray);

    }

    }