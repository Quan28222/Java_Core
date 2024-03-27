package com.example.JavaCore.Bai3_Array;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Quan", "Gioi", "Hai", "Son"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap vao ten hoc sinh: ");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vi tri cua sinh vien " + input_name + " trong danh sach la: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Khong co " + input_name + " trong danh sach.");
    }
}
