package com.example.JavaCore.Bai3_Array;

import java.util.Scanner;

public class TimRaGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {

        int kichThuoc;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Moi nhap vao kich thuoc cua mang: ");
            kichThuoc = scanner.nextInt();
            if (kichThuoc > 20) {
                System.out.println("Vui long nhap kich thuoc cua mang nho hon 20!");
            }
        } while (kichThuoc > 20);

        array = new int[kichThuoc];
        int i = 0;
        while (i < array.length) {
            System.out.print("Vui long nhap vao gia tri cua mang " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("mang cua ban vua nhap la: \n");
        for (int k : array) {
            System.out.println(k + "\t");
        }

        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[index] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("\nGia tri nho nhat cua mang la: " + min + "\nGia tri nho nhat nam o vi tri: " + index);
    }
}
