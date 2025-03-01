package Q_10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String input = scanner.nextLine();

        if (input.length() % 2 == 1) {

            int middleIndex = input.length() / 2;


            System.out.println(input.charAt(middleIndex));
        } else {
            System.out.println("Please enter a word with an odd number of characters.");
        }

        scanner.close();
    }
}
