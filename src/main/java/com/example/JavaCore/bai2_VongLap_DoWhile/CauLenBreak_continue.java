package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class CauLenBreak_continue {
    // cau lenh break
    public static void main1(String[] args) {
        float sum = 0;
        int count, subject = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao " +subject + " subject: ");
        for(count = 0; count<subject; count++){
            float mark;
            mark = scanner.nextFloat();
            if (mark < 0)
                break;
            sum += mark;
        }
        if(count >= subject)
            System.out.println("Average mark = "+sum/subject);
        else
            System.out.println("Error: Invalid mark");
    }
    // cau lenh continue
    public static void main(String[] args) {
        float sum = 0;
        int count = 0, subjects = 3;
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter the marks for " + subjects + " subjects: \n");
        while (count < subjects) {
            System.out.print("#" + (count+1) + ": ");
            float mark = input.nextFloat();
            if (mark < 0) {
                System.out.println(mark + " ignored");
                continue;
            }
            sum += mark;
            count++;
        }
        System.out.print("Average mark = "+sum/subjects);
    }
}
