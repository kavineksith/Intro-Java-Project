package org.example;

public class Loops {

    public static void main(String[] args) {
        // For loop example
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        // While loop example
        int j = 0;
        while (j < 5) {
            System.out.println("While Loop Iteration: " + j);
            j++;
        }

        // Do-while loop example
        int k = 0;
        do {
            System.out.println("Do-While Loop Iteration: " + k);
            k++;
        } while (k < 5);

        // Enhanced for loop example (for-each)
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Nested loop example
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 2; n++) {
                System.out.println("Nested Loop Iteration: " + m + ", " + n);
            }
        }

        // Infinite loop example (commented out to prevent execution)
        // while (true) {
        //     System.out.println("This is an infinite loop");
        //     break; // Break statement to exit the infinite loop
        // }

        // Break and continue examples
        for (int p = 0; p < 10; p++) {
            if (p == 5) {
                System.out.println("Breaking at: " + p);
                break; // Breaks the loop when p equals 5
            }
            System.out.println("Current value: " + p);
        }

        for (int q = 0; q < 10; q++) {
            if (q % 2 == 0) {
                System.out.println("Skipping even number: " + q);
                continue; // Skips the rest of the loop iteration for even numbers
            }
            System.out.println("Odd number: " + q);
        }

        // Example of using a loop with a condition
        int count = 0;
        while (count < 5) {
            System.out.println("Count is: " + count);
            count++;
        }

        // Example of using a loop with a break condition
        for (int v = 0; v < 10; v++) {
            if (v == 7) {
                System.out.println("Breaking loop at value: " + v);
                break; // Breaks the loop when v equals 7
            }
            System.out.println("Current value: " + v);
        }

        // Example of using a loop with a continue condition
        for (int w = 0; w < 10; w++) {
            if (w % 2 == 0) {
                System.out.println("Skipping even number: " + w);
                continue; // Skips the rest of the loop iteration for even numbers
            }
            System.out.println("Odd number: " + w);
        }

        // Example of using a loop with a condition and a break
        int number = 0;
        while (number < 10) {
            System.out.println("Number is: " + number);
            if (number == 5) {
                System.out.println("Breaking loop at number: " + number);
                break; // Breaks the loop when number equals 5
            }
            number++;
        }

        // Example of using a loop with a condition and a continue
        for (int b = 0; b < 10; b++) {
            if (b % 2 == 0) {
                System.out.println("Skipping even number: " + b);
                continue; // Skips the rest of the loop iteration for even numbers
            }
            System.out.println("Odd number: " + b);
        }
    }
}
