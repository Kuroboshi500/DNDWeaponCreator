
/**
 * main
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean check = true;
        Scanner Input = new Scanner(System.in);
        int userInput = 10;
        while (check) {
            System.out.println("Welcome to the Weapon Generator \n" +
                    "Choose an option:\n" +
                    "\t 1. Create new weapon\n" +
                    "\t 2. Check preset weapons\n" +
                    "\t 3. Check preset enchantments\n" +
                    "\t 4. Check weapon properties\n" +
                    "\t 5. Check list of stored weapons\n" +
                    "\t 0. Exit program\n");
            userInput = Input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("This option is currently in progress. Come back another time");
                    break;
                case 2:
                    System.out.println("This option is currently in progress. Come back another time");
                    break;
                case 3:
                    System.out.println("This option is currently in progress. Come back another time");
                    break;
                case 4:
                    System.out.println("This option is currently in progress. Come back another time");
                    break;
                case 5:
                    System.out.println("This option is currently in progress. Come back another time");
                    break;
                case 0:
                    System.out.println("Thank you for using this Weapon generator\n\n\t Hope to see you again!");
                    check = false;
                    break;
                default:
                    System.out.println(
                            "Invalid Input\n..............................\n\tRedisplaying menu\n..............................\n");
                    break;

            }

        }
        Input.close();

    }
}