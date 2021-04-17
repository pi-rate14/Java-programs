package com.apoorva;
import java.io.*;
import java.util.*;
class Employee
{
    String eid;
    String name;
    int year;
    Employee(String eid, String name, int year)
    {
        this.eid = eid;
        this.name = name;
        this.year = year;
    }
}
class invalidId extends Exception{}

public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of employees: ");
        int noEmp = sc.nextInt();
        Employee[] emp = new Employee[noEmp];
        int temp = noEmp;
        String eid;
        String name;
        int year;
        String [] splitup;
        int total = 0;
        while(temp>0)
        {
            System.out.println("Enter the Employee ID (YY-F/S-NNN): ");
            eid =sc.next();
            System.out.println("Enter the Employee Name: ");
            name = sc.next();
            System.out.println("Enter the year the Employee joined: ");
            year = sc.nextInt();
            System.out.println("---------------------------------------------");
            splitup = eid.split("-");
            try{
                if(splitup[0].length()!=2)
                {
                    System.out.println("The year in Employee ID (year-designation-number) is incorrect");
                    throw new invalidId();
                }
                for(int i=0;i<splitup[0].length();i++)
                {
                    if(!(Character.isDigit(splitup[0].charAt(i))))
                    {
                        System.out.println("The year in Employee ID (year-designation-number) is incorrect");
                        throw new invalidId();
                    }
                }
                if (!(splitup[1].equals("S")) ||(splitup[1].equals("F")))
                {
                    System.out.println("The designation in Employee ID (year-designation-number) is incorrect");
                    throw new invalidId();
                }
                if(splitup[2].length()!=3)
                {
                    System.out.println("The number in Employee ID (year-designation-number) is incorrect");
                    throw new invalidId();
                }
                for (int i=0;i<splitup[2].length();i++)
                {
                    if(!(Character.isDigit(splitup[2].charAt(i))))
                    {
                        System.out.println("The number in Employee ID (year-designation-number) is incorrect");
                        throw new invalidId();
                    }
                }
                emp[total] = new Employee(eid,name,year);
                total++;
                System.out.println("");
            }
            catch( invalidId ex)
            {
                System.out.println("Invalid Employee ID");
            }
            temp--;
        }
        System.out.println("Displaying all the values: ");
        for (int i=0;i<total;i++)
        {
            System.out.println("Employee ID");
            System.out.println(emp[i].eid);
            System.out.println("Employee Name");
            System.out.println(emp[i].name);
            System.out.println("Year the Employee joined");
            System.out.println(emp[i].year);
            System.out.println("");
        }
    }
}