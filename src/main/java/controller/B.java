package controller;

import java.util.Scanner;

public class B {
    public void doB(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num =Integer.parseInt(scanner.nextLine());
        System.out.print("Enter how many time to multiply: ");
        int amount =Integer.parseInt(scanner.nextLine());
        System.out.println("<"+num+"x>");
        for (int counter=1; counter<=amount;counter++){
            System.out.println(num+"x"+counter+"="+num*counter);
        }

    }
}
