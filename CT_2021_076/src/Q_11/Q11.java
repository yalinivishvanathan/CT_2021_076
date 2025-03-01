package Q_11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (First Middle Last): ");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        if (parts.length == 3) {
            String firstName = parts[0];
            String middleInitial = parts[1].charAt(0) + ".";
            String lastName = parts[2];

            System.out.println(lastName + ", " + firstName + " " + middleInitial);
        } else {
            System.out.println("Please enter a valid full name with first, middle, and last names.");
        }

        scanner.close();
    }
}
