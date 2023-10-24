package homework_week_7;

/**
 * Same as above program-8 using switch statement.
 * Input any alphabet from A to “F” and print their city name accordingly
 * if any other alphabet should be invalid entry
 */
public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
                // Replace 'input' with the desired character (A to F)
                char input = 'D';

                switch (input) {
                    case 'A':
                        System.out.println("City: Ahmedabad");
                        break;
                    case 'B':
                        System.out.println("City: Bhavnagar");
                        break;
                    case 'C':
                        System.out.println("City: Channai");
                        break;
                    case 'D':
                        System.out.println("City: Delhi");
                        break;
                    case 'E':
                        System.out.println("City: Egypt");
                        break;
                    case 'F':
                        System.out.println("City: Faziabad");
                        break;
                    default:
                        System.out.println("Invalid entry. Please enter an alphabet from A to F.");
                }


    }
}
