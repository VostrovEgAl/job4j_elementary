package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 178;
        double man = manWeight(height);
        height = 165;
        double woman = womanWeight(height);

        System.out.printf("Man 178 is %.2f%n", man);
        System.out.printf("Woman 165 is %.2f%n", woman);
    }
}