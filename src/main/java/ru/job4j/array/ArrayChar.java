package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int p = 0; p < prefix.length; p++) {
            if (prefix[p] != word[p]) {
                result = false;
                break;
            }
        }
        return result;
    }
}