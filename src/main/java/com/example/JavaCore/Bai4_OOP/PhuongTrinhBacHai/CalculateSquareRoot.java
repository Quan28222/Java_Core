package com.example.JavaCore.Bai4_OOP.PhuongTrinhBacHai;

import java.util.Scanner;

public class CalculateSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("You enter a:  ");
        double a = scanner.nextDouble();
        System.out.print("You enter b:  ");
        double b = scanner.nextDouble();
        System.out.print("You enter c:  ");
        double c = scanner.nextDouble();

        ///-------------------------
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getA() == 0) {
            if (quadraticEquation.getB() != 0) {
                System.out.println("x = " + quadraticEquation.getX());
            } else if (quadraticEquation.getC() == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            if (quadraticEquation.getDiscriminant() > 0) {
                System.out.println("Phuong trinh co 2 nghiem la x1 = " + quadraticEquation.getRoot1() + " x2 = " + quadraticEquation.getRoot2());
            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("Phuong trinh co 1 nghiem kep la x1 = x2 = " + quadraticEquation.OneSolution());
            } else {
                System.out.println("Phuong trinh vo nghiem: ");
            }
        }
    }
}
