package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 88;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 76;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.2f;
        return rsl;

    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.8f;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(176);
        System.out.println("176 rubles are " + euro + " euro.");
        euro = Converter.dollarToEuro(17);
        System.out.println("17 dollars is " + euro + " euro.");
        float dollars = Converter.rubleToDollar(600);
        System.out.println("600 rubles is " + dollars + " dollars.");
        dollars = Converter.euroToDollar(18);
        System.out.println("18 euro is " + dollars + " dollars.");
    }
}