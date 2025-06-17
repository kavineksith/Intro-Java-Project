package org.example;

public class Methods {

    public static int Addition(int firstNumber, int secondNumber) {
        int total = firstNumber + secondNumber;
        return total;
    }

    public static void main(String[] args) {

        System.out.println("Total: ".concat(String.valueOf(Addition(5, 5))));
        System.out.println("Hello World");
    }
}
