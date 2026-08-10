package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("180 rubles are " + dollar + " dollar.");
        input = 120;
        output = rubleToDollar(input);
        System.out.println("120 rubles are 2. Test result : " + passed);
    }
}