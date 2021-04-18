package com.apoorva;

import java.util.Scanner;
import java.io.*;
import java.time.LocalDate;
import java.time.Period;

class Donor implements java.io.Serializable {
    String name, address, blood_group, date_of_last_donation;
    int age;
    long contact_number;

    Donor(String name, String address, String blood_group, String date_of_last_donation, int age, long contact_number) {
        this.name = name;
        this.address = address;
        this.blood_group = blood_group;
        this.date_of_last_donation = date_of_last_donation;
        this.age = age;
        this.contact_number = contact_number;
    }
}

public class Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of objects: ");
        int n = sc.nextInt();
        sc.nextLine();
        Donor objs[] = new Donor[n];
        String filename = "DonorFile.ser";
        System.out.println("Enter current date in format yyyy-mm-dd");
        String currDate = sc.nextLine();
        // Serialization
        try {
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            for (int i = 0; i < n; i++) {
                System.out.println("Enter name of donor " + (i + 1) + ": ");
                String name = sc.nextLine();
                System.out.println("Enter address of donor " + (i + 1) + ": ");
                String address = sc.nextLine();
                System.out.println("Enter blood group of donor " + (i + 1) + ": ");
                String blood_group = sc.nextLine().toLowerCase();
                System.out.println("Enter date of last donation of donor " + (i + 1) + " in format yyyy-mm-dd: ");
                String date_of_last_donation = sc.nextLine();
                System.out.println("Enter age of donor " + (i + 1) + ": ");
                int age = sc.nextInt();
                System.out.println("Enter contact number of donor " + (i + 1) + ": ");
                long contact_number = sc.nextLong();
                sc.nextLine();
                objs[i] = new Donor(name, address, blood_group, date_of_last_donation, age, contact_number);
                out.writeObject(objs[i]);
            }
            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }

        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
        Donor object1 = null;

        // Deserialization
        try {
            boolean cont = true;
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            int x = 0;
            int count = 0;
            while (cont == true && x < n) {
                x++;
                object1 = (Donor) in.readObject();
                if (object1 != null) {
                    System.out.println(object1.blood_group);
                    System.out.println(object1.date_of_last_donation);

                    if ((object1.blood_group.equals("a+"))
                            && Period.between(LocalDate.parse(object1.date_of_last_donation), LocalDate.parse(currDate))
                                    .getMonths() > 6) {
                        System.out.println(object1.name + " " + object1.address + " " + object1.blood_group + " "
                                + object1.date_of_last_donation + " " + object1.contact_number + " " + object1.age);
                        count = 1;
                    }
                }

            }
            // Method for deserialization of object
            if (count == 0)
                System.out.println("No such donor");

            in.close();
            file.close();
        }

        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

    }

}