package com.example.JavaCore.Bai3_Array;

import java.util.Scanner;

public class DaoPhanTuTrongMang {
    public static void main(String[] args) {
        int kichThuoc;
        Scanner scanner = new Scanner(System.in);
        int[] array;
        do {
            System.out.print("Moi ban nhap vao kich thuoc: ");
            kichThuoc = scanner.nextInt();
            if (kichThuoc > 20) {
                System.out.println("Nhap vao kich thuoc nho hon 20");
            }
        } while (kichThuoc > 20);

        array = new int[kichThuoc];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhap vap " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int value : array) {
            System.out.print(value + "\t");
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[kichThuoc - 1 - j];
            array[kichThuoc - 1 - j] = temp;
        }

        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int k : array) {
            System.out.print(k + "\t");
        }

    }
}
