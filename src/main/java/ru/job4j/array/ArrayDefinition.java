package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] aegis = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Lilo";
        names[1] = "Tim";
        names[2] = "Tom";
        names[3] = "Mickael";

        System.out.println("Размер массива равен: " + aegis.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
