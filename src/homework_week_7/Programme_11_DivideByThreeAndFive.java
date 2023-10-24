package homework_week_7;

public class Programme_11_DivideByThreeAndFive {
    public static void main(String[] args) {
        System.out.print("Number Division by 3 : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ".");
            }
        }
        System.out.println();
        System.out.print("Number Division by 5 : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ".");


            }

        }
    }
}