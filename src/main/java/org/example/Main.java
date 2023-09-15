package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int ITERATIONS = 10;
    public static void main(String[] args) {
        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= ITERATIONS; i++) {
            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        System.out.println("Pruebas de suma");
    }
    public int sum(int op1, int op2) {
        return op1 + op2;
    }
}