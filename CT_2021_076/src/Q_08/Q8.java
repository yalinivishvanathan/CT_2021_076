package Q_08;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string with an exclamation mark: ");
        String input = scanner.nextLine();

        // Find the index of '!' in the string
        int index = input.indexOf('!');

        if (index != -1) {
            // Split the string into two parts
            String part1 = input.substring(0, index).trim();
            String part2 = input.substring(index + 1).trim();

            // Print the results
            System.out.println(part1);
            System.out.println(part2);
        } else {
            System.out.println("The input does not contain an exclamation mark!");
        }

        scanner.close();
    }
}