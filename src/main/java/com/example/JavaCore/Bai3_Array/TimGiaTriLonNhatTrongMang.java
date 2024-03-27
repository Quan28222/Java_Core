package com.example.JavaCore.Bai3_Array;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int kichThuoc;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Moi ban nhap vao kich thuoc cua mang: ");
            kichThuoc = scanner.nextInt();
            if (kichThuoc > 20)
                System.out.println("Vong long nhap gia tri nho hon 20");
        } while (kichThuoc > 20);

        array = new int[kichThuoc];
        int i = 0;
        while (i < array.length) {
            System.out.print("Vui long nhap gia tri cho mang: " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Gia tri mang vua nhap: \n");
        for (int k : array) {
            System.out.print(k + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("\nGia tri lon nhat cua mang la:  " + max + " \nPhan tu cua mang la:  " + index);
    }
}
