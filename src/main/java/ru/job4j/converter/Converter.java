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
        float in = 176;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float in1 = 17;
        double expected1 = 13.6;
        float out1 = Converter.dollarToEuro(in1);
        boolean passed1 = expected == out;
        System.out.println("17 dollars are 13.6. Test result : " + passed1);
        float in2 = 600;
        double expected2 = 7.894737;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected == out;
        System.out.println("600 rubles are 7.894737. Test result : " + passed2);
        float in3 = 18;
        double expected3 = 21.6;
        float out3 = Converter.euroToDollar(in3);
        boolean passed3 = expected == out;
        System.out.println("18 euro are 21.6. Test result : " + passed3);
    }
}