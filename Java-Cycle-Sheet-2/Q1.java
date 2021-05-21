package com.apoorva;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Q1 {
    static Map<String, List<String>> h1 = new HashMap<String, List<String>>();
    static Map<String, Integer> h2 = new HashMap<String, Integer>();

    public void add_in_h1(String key, List<String> values) {
        h1.put(key, values);
        System.out.println(key + " added!");
    }

    public void delete_in_h1(String key) {
        h1.remove(key);
        System.out.println(key+" deleted!");
    }

    public void findFaculties(String key) {
        if (h1.containsKey(key)) {
            List<Integer> faculties = new ArrayList<Integer>();
            List<String> list = h1.get(key);
            Set<String> keys = h2.keySet();
            for (String l : list) {
                for (String k : keys) {
                    if (l.equals(k)) {
                        faculties.add(h2.get(k));
                    }
                }
            }
            System.out.println(faculties);
        } else
            System.out.println("No such student");
    }

    public static void main(String[] args) {
        int choice = 0;
        List<String> valSetOne = new ArrayList<String>();
        valSetOne.add("Python");
        valSetOne.add("Maths");
        valSetOne.add("C");

        List<String> valSetTwo = new ArrayList<String>();
        valSetTwo.add("C");
        valSetTwo.add("C++");

        List<String> valSetThree = new ArrayList<String>();
        valSetThree.add("C++");
        valSetThree.add("Physics");
        valSetThree.add("Chemistry");

        h1.put("A", valSetOne);
        h1.put("B", valSetTwo);
        h1.put("C", valSetThree);

        h2.put("Python", 111);
        h2.put("Maths", 222);
        h2.put("C", 333);
        h2.put("C++", 444);
        h2.put("Physics", 555);
        h2.put("Chemistry", 666);
        h2.put("Digital Electronics", 777);




            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("\n1)Add a student in H1.\n" +
                        "2)Remove a student in H1.\n" +
                        "3)Display both the maps\n" +
                        "4)Find faculty of a student\n" +
                        "5)Exit\n"
                );
                System.out.println("enter choice:");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        Q1 c2 = new Q1();
                        System.out.println("enter name of student to add");
                        String nameAdd = sc.next();
                        List<String> val = new ArrayList<String>();
                        val.add("Social Science");
                        val.add("Computer Science");
                        val.add("DSA");
                        c2.add_in_h1(nameAdd, val);
                        System.out.println("\n");
                        break;
                    case 2:
                        Q1 c1 = new Q1();
                        System.out.println("enter name of student to remove");
                        String nameDelete = sc.next();
                        c1.delete_in_h1(nameDelete);
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("Keys and corresponding Values in H1:");
                        for (Map.Entry<String, List<String>> entry1 : h1.entrySet()) {
                            String key1 = entry1.getKey();
                            List<String> values1 = entry1.getValue();
                            System.out.println(key1 + ":" + values1);
                        }
                        System.out.println("\n");
                        System.out.println("Keys and corresponding Values in H2:");
                        for (Map.Entry<String, Integer> entry2 : h2.entrySet()) {
                            String key2 = entry2.getKey();
                            Integer values2 = entry2.getValue();
                            System.out.println(key2 + ":" + values2);
                        }
                        System.out.println("\n");
                        break;
                    case 4:
                        Q1 c3 = new Q1();
                        System.out.println("enter name of student to find faculties of");
                        String nameFaculty = sc.next();
                        c3.findFaculties(nameFaculty);
                        System.out.println("\n");
                        break;
                    default:
                        System.out.println("Thank you for using the program!");
                }
            } while (choice != 5);
    }
}