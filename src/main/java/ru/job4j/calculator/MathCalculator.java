package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDel(double first, double second) {
        return minus(first, second)
                + del(first, second);
    }

    public static double all(double first, double second) {
        return sumAndMultiply(first, second)
                + minusAndDel(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAndDel(10, 20));
        System.out.println("Результат расчета равен: " + all(10, 20));
    }
}