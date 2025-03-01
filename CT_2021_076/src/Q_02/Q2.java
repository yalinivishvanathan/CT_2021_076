package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        System.out.println("Enter first name");
        String firstname= name.next();
        System.out.println("Enter last name");
        String lastname= name.next();

        JFrame frame=new JFrame();
        frame.setSize(800,600);
        frame.setTitle(firstname+" "+lastname);
        frame.setVisible(true);

    }
}
