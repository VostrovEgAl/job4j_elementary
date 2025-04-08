package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result;
        result = (left >= right) ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int big = max(7, 4);
        System.out.println(big);
    }
}