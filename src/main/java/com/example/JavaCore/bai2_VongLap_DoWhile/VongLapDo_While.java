package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class VongLapDo_While {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Keep reading data until the input is 0
        do {
            // Read the next data
            System.out.print(
                    "Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();

            sum += data;
        } while (data < 13);

        System.out.println("The sum is " + sum);
    }
}
