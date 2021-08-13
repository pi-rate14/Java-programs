package com.apoorva;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
/*
 * The following list gives the amount of rainfall (in cms) recorded at a particular place for 12 months.
10.2, 11.9, 8.0, 11.2, 10.8, 6.9, 8.2, 11.5, 10.4, 8.7, 7.8, 7.5.
Store these values in an queue. Find the average rainfall 
and display the count of the number of months in which the rainfall is more than the average.
 */
public class Q3 {

    public static void main(String[] args) {
        Queue<Double> q = new LinkedList<Double>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of rainfall of 12 months: ");
        double avg=0;
        for (int i = 0; i < 12; i++) {
            double temp = sc.nextDouble();
            q.add(temp);
            avg+=temp;
        }
        avg/=12;
        int count=0;
        while(q.size()>0) {
            if(q.remove()>avg)
                count++;
        }
        System.out.println("Average rainfall: "+avg);
        System.out.println("The number of months where rainfall was greater than the average rainfall: "+count);
    }

}