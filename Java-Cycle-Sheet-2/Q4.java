package com.apoorva;

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        double timeInHours;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current time in hours : ");
        timeInHours = sc.nextDouble();
        System.out.println();
        try {
            throw new customTimeException(timeInHours);
        } catch (customTimeException e) {
            System.out.println(e);
        }
    }
}

class customTimeException extends Exception {
    private double timeofDay;

    public customTimeException(double timeofDay) {
        this.timeofDay = timeofDay;
    }

    public String toString() {
        String reminder = null;
        if (timeofDay >= 5 && timeofDay < 12)
            reminder = "Morning, Have Fresh Vegetable Juice and then Sugar Tablet with mild walking";
        else if (timeofDay >= 12 && timeofDay < 17)
            reminder = "its Day Time, after lunch have tablet to avoid sleep";
        else if (timeofDay >= 17 && timeofDay < 18.30)
            reminder = "Hello, Good Evening have a dinner";
        else
            reminder = "Night, Go for sleep";
        return reminder;
    }
}