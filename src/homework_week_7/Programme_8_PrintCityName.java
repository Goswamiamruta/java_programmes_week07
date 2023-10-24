package homework_week_7;

/**
 * Input any alphabet from A to “F” and print their city name accordingly (use if else)
 * any other alphabet should be invalid entry
 */
public class Programme_8_PrintCityName {

    public static void main(String[] args) {
        char input = 'c';

        if (input > 'A' && input <= 'F') {
            if (input == 'A') {
                System.out.println("City : Ahmedabad");
            } else if (input == 'B') {
                System.out.println("City : Bhavnagar");
            } else if (input == 'C') {
                System.out.println("City : Chandigarh");
            } else if (input == 'D') {
                System.out.println("City : Delhi");
            } else if (input == 'E') {
                System.out.println("City : Egypt");
            } else if (input == 'F') {
                System.out.println("City : Faizabad");
            }
        } else {
            System.out.println("Invalid entry. Please enter an alphabet from A to F.");

        }


    }
}
