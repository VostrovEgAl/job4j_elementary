package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] ip = new int[5];
        for (int i = 0; i < ip.length; i++) {
            ip[i] = i * 2 + 3;
        }
        for (int i : ip) {
            System.out.println(i);
        }
    }
}
