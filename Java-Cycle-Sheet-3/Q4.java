package com.apoorva;

import java.util.*;

class book {
    String name;
    String author;
    int price;
    int noOfCopies;

    book(String name, String author, int price, int noOfCopies) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.noOfCopies = noOfCopies;
    }
}

public class Q4 {
    public static int search(HashMap<book, Integer> list, String bookName) {
        for (Map.Entry<book, Integer> entry : list.entrySet()) {
            book b = entry.getKey();
            if (b.name.equals(bookName)) {
                return entry.getValue();
            }
        }
        return -1;
    }

    public static void sort(HashMap<book, Integer> list, int rack) {
        for (Map.Entry<book, Integer> entry : list.entrySet()) {
            if (rack == entry.getValue()) {

                book b = entry.getKey();
                System.out.println("Book details: ");
                System.out.println("Book Name: " + b.name);
                System.out.println("Book Author: " + b.author);
                System.out.println("Price: " + b.price);
                System.out.println("No. of Copies: " + b.noOfCopies + "\n");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<book, Integer> list = new HashMap();
        book[] objs = new book[5];
        objs[0] = new book("Invisible Man", "HG Wells", 210, 260);
        objs[1] = new book("Animal Farm", "Oscar Wilde", 170, 45);
        objs[2] = new book("Hamlet", "William Shakespeare", 340, 10);
        objs[3] = new book("Fault in our Stars", "John Greene", 200, 600);
        objs[4] = new book("Odyssey", "Homer", 420, 12);
        for (int i = 0; i < 5; i++)
            list.put(objs[i], (i + 1));
        System.out.println(list);
        boolean flag = true;
        int choice;
        while (flag) {
            int rack;
            String s;
            System.out.println("1)Search Rack No. by Book name\n" + "2)Search Book name by Rack No.\n" + "3)Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Book name: ");
                    s = sc.next();
                    rack = search(list, s);
                    if (rack == -1) {
                        System.out.println("The Rack Number is: " + 1 + "\n");
                    } else {
                        System.out.println("The Rack Number is: " + rack + "\n");
                    }
                    break;
                case 2:
                    System.out.print("Enter the Rack No: ");
                    rack = sc.nextInt();
                    sort(list, rack);
                    break;
                case 3:
                    System.out.println("Exit");
                    flag = false;
                    break;
            }
        }
    }
}