package ru.job4j.condition;

import java.time.LocalDateTime;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + " " + "But I am a newbie.";
        int year = 2022;
        String newbie1 = idea + " " + year;
        System.out.println(newbie1);
    }
}
