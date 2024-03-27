package com.example.JavaCore.Bai4_OOP.PhuongTrinhBacHai;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    private double a, b, c = 0;
    private double r1 = 0;
    private double r2 = 0;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getR1() {
        return (-b + sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public double getR2() {
        return (-b - sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return this.getR1();
    }

    public double getRoot2() {
        return this.getR2();
    }

    double x = 0;
    public double getX() {
        return x = -c / b;
    }
    double neSolution = 0;

    public float OneSolution(){
        return (float) (this.neSolution = (-b / (2 * a)));
    }

}
