package controller;

import java.util.Scanner;

public class D {
    public void doD(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int c =Integer.parseInt(scanner.nextLine());
        System.out.print("Enter another number: ");
        int d =Integer.parseInt(scanner.nextLine());
        System.out.println("<Multiply table "+c+"x"+d+">");
        for (int a=1; a<=c;a++) {
            for (int b = 1; b <= d; b++) {
                System.out.print(b * a + "\t");
            }
            System.out.println("");
        }


    }
}
