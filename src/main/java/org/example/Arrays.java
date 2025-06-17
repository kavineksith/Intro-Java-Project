package org.example;

public class Arrays {

    String[] fruits = {"Orange", "Mango", "Dragon fruit", "Apple"};

    public static void main(String[] args) {
        Arrays arrays = new Arrays();
//        for (String fruit : arrays.fruits) {
//            System.out.println("Fruit: ".concat(fruit));
//        }


        for (int i=0; i <= arrays.fruits.length - 1; i++) {
            System.out.println(i + " : " + arrays.fruits[i]);
        }

        System.out.println("\n");

        for (int i = arrays.fruits.length - 1; i >= 0; i--) {
            System.out.println(i + " : " + arrays.fruits[i]);
        }

        int[][] myNumbers = {
                {1, 2, 3, 4},
                {5, 6, 7}
        };
        System.out.println(myNumbers[1][2]);

        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

    }
}
