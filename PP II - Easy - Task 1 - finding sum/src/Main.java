import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt(); // entrance of first integer by terminal

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt(); // entrance of second integer by terminal

        int sum = num1 + num2; // sum of entered numbers

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum); //printing out the final results

        input.close();
    }
}