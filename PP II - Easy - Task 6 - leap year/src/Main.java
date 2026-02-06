import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();


        boolean isLeapYear = false;  // checking if it is leap year or not

        if (year % 4 == 0) {
            if (year % 100 == 0) {   // if year is divisible by 100
                if (year % 400 == 0) {   // if year is divisible by 400
                    isLeapYear = true;
                } else {
                    isLeapYear = false;  // if year is divisible by 100 but not by 400

                }
            } else {
                isLeapYear = true;  // if year is divisible by 4 but not by 100
            }
        } else {
            isLeapYear = false;  // if year is not divisible by 4
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year, you are correct");  // printing out that it is a leap year.
        } else {
            System.out.println(year + " is not a leap year");  //printing out that it is not a leap year.
        }

        scanner.close();
    }
}