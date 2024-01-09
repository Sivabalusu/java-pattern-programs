package org.example;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = 5;

        for (int i = 0; i < n; i++) {
            int number = 1; // Declaration of the "number" variable
            for (int j = 0; j < n - i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
