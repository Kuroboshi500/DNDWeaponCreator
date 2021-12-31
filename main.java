/**
 * main
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean check  = true;
        Scanner Input = new Scanner(System.in);
        int userInput = 10;
        while(check){
            System.out.println("Welcome to the Weapon Generator/nChoose an option:/n 1. Create new weapon"+
                "/n 2. Check preset weapons /n 3. Check preset enchantments /n 4. Check weapon properties"+
                "/n 5. Check list of stored weapons /n 0. Exit program");
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
                    System.out.println("Thank you for using this Weapon generator/n/n/t Hope to see you again!");
                    check = false;
                    break;
                default:
                    System.out.println("Invalid Input/n/n/tRedisplaying menu");
                    break;
            }
            

        }
    
    }
}