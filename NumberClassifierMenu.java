import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char userChoice;

        do {
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();
                    if (number > 0) {
                        System.out.println("The number " + number + " is positive.");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number " + number + " is zero.");
                    }
                    break;
                case 2:
                    System.out.print("Enter a number to print its multiplication table: ");
                    int num = input.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num + " x " + i + " = " + (num * i));
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 1 and 3.");
                    break;
            }

            System.out.print("Do you want to return to the menu? (Y/N): ");
            input.nextLine();  
            userChoice = input.nextLine().toUpperCase().charAt(0);

        } while (userChoice == 'Y');

        input.close();
    }
}
