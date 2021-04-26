/*
Build a multiplication table system.
At first, it should be possible to just see the results of
one number up till a fix number (12 times for instance)

Once you perfect that, it should be possible to give the number
to multiply and how many times you want to see it multiplied eg:
1 enter 2 and 24; it means i want to see the table of multiples of 2 up to 24 times
Once you get that part done, try to generate a fixed / manual
table containing a range of numbers and their multiple like below.

If you are able to pull the table above off, make it possible for
users to tell the range of numbers they want to generate for e.g:
start: 23; stop: 32; and how many multiples they want to create and
generate the table automatically based on the data provided.


*/

import controller.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu= new Menu();
        menu.showMenu();

    }
}
class Menu {
    public void showMenu(){
        A a =new A();
        B b =new B();
        C c =new C();
        D d =new D();
        E e =new E();
        System.out.println("Choose homework:" +
                "\nA for fixed number multiply" +"\t\tB for your number multiply" +
                "\nC for fixed multiply table" +"\t\tD for your range multiply table" +
                "\nE for your range multiply table with array" +
                "\nQ for quit");
        System.out.print("Type here: ");
        Scanner scanner = new Scanner(System.in);
        String option=scanner.nextLine();
        switch (option.toLowerCase()){
            case "a":
                a.doA();
                System.out.println("\nPres enter to continue");
                scanner.nextLine();
                break;
            case "b":
                b.doB();
                System.out.println("\nPres enter to continue");
                scanner.nextLine();
                break;
            case "c":
                c.doC();
                System.out.println("\nPres enter to continue");
                scanner.nextLine();
                break;
            case "d":
                d.doD();
                System.out.println("\nPres enter to continue");
                scanner.nextLine();
                break;
            case "e":
                e.doE();
                System.out.println("\nPres enter to continue");
                scanner.nextLine();
                break;
            case "q":
                System.out.println("\nExiting");
                return;
            default:
                System.out.println("\nTry again");
                break;
        }
        this.showMenu();
    }
}