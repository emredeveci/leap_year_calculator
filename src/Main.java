import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable needed
        int year;

        Scanner scanner = new Scanner(System.in);

        //receive user input
        System.out.print("Please enter a year: ");
        year = scanner.nextInt();

        //logic for leap year
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.print(year + " is a leap year");
        } else {
            System.out.print(year + " is not a leap year");
        }

        scanner.close();
    }
}