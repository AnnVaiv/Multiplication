package controller;

public class C {
    public void doC(){
        System.out.println("<Multiply table 10x10>");
        for (int a=1; a<=10;a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print(b * a + "\t");
            }
            System.out.println("");
        }

    }
}
