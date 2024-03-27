package com.example.JavaCore.Bai3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Vui long nhap gia tri " + (i + 1) + " cho mang : ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Danh sach gia tri mang ban vua nhap la: " + Arrays.toString(array1));
    }
}
