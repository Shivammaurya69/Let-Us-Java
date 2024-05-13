package com.CH_10;

import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();

        System.out.println("Current Time:");
        System.out.println("Hour   : " + hour);
        System.out.println("Minute : " + minute);
        System.out.println("Second : " + second);
    }
}

