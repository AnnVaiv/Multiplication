package controller;

import java.util.LinkedList;
import java.util.Scanner;

public class E {
    public void doE() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number to: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter another number from: ");
        int c = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter another number to: ");
        int d = Integer.parseInt(scanner.nextLine());
        System.out.println("<Multiply table " + a +".."+b + "x" + c +".."+d + ">");
        LinkedList<Integer> column=new LinkedList<>();
        //LinkedList<LinkedList> row=new LinkedList<>();


    //public LinkedList<Integer> makeRow(){// ???

        for (int j = c;j<=d;j++){

            for (int i = a; i <= b; i++) {
                column.add(i*j);
                System.out.print(column.poll()+"\t");
            }

            System.out.println("");

        }


    }
}
