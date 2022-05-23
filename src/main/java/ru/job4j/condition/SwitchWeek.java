package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String weekDay;
        switch (day) {
            case 1:
                weekDay = "понедельник";
                break;
            case 2:
                weekDay = "вторник";
                break;
            case 3:
                weekDay = "среда";
                break;
            case 4:
                weekDay = "четверг";
                break;
            case 5:
                weekDay = "пятница";
                break;
            case 6:
                weekDay = "суббота";
                break;
            case 7:
                weekDay = "воскресенье";
                break;
            default:
                weekDay = "Ошибка";
                break;
        }
        return weekDay;
    }
}