package Q_03;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        System.out.println("Enter first name");
        String firstname= name.next();
        System.out.println("Enter middle name");
        String middleName= name.next();
        System.out.println("Enter last name");
        String lastname= name.next();

        String initial=middleName.substring(0,1);
        System.out.println(firstname+" "+initial+" "+lastname);
    }
}