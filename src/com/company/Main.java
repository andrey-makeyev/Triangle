package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the base's length of the triangle: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) { // for base's length of the triangle
            for (int j = i; j < length; j++) { // creating left side space
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) { //printing *
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
