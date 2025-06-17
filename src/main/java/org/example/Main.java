package org.example;

import java.util.Scanner; // import the Scanner class to read input from the user

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner is used to read input from the user

        System.out.print("Your Age: ");
        int userAge = Integer.parseInt(scanner.next()); // read user input and convert it to an integer

        String status; // variable declaration
        // conditional assignment of status based on user age
        if (userAge >= 28) {
            status = "VIP - Access granted"; // assign status based on user age
        } else if (userAge >= 18){
            status = "Access granted"; // assign status based on user age
        } else {
            status = "Access denied"; // assign status based on user age
        }

        status = (userAge >= 28) ? "VIP - Access granted" : (userAge >= 18) ? "Access granted" : "Access denied"; // ternary operator for conditional assignment

        System.out.println("Status: " + status); // print the status to the console

        scanner.close(); // close the scanner to prevent resource leaks

        int luckyNumber = 0;
        System.out.println(luckyNumber); // print the initial lucky number

        luckyNumber = luckyNumber + 1; // increment luckyNumber by 1
        System.out.println(luckyNumber); // print the incremented lucky number

        // shorter way to increment luckyNumber by 1
        luckyNumber += 1; // another way to increment luckyNumber by 1
        System.out.println(luckyNumber); // print the incremented lucky number again

        // single comment

        /*
        * Multi line comment
        * */

        /**
         * sample comment
         */
//
//        String userName = "Pokemon";
//        int userAge = 17;
//        float gpa = 4.5F;
//
//        String label = "User Name: ";
//
//        System.out.println(label.concat(userName));
    }
}