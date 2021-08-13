package com.apoorva;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Q1
{
    static Map<String, List<String>> map1 = new HashMap<String, List<String>>();
    static Map<String,Integer> map2 = new HashMap<String,Integer>();
    public void add_in_map1(String key, List<String> values)
    {
        map1.put(key, values);
        System.out.println(map1);
    }
    public void delete_in_map1(String key)
    {
        map1.remove(key);
        System.out.println(map1);
    }

    public void findFaculties(String key)
    {
        if(map1.containsKey(key))
        {
            List<Integer> faculties = new ArrayList<Integer>();
            List<String> list = map1.get(key);
            Set<String> keys = map2.keySet();
            for(String l:list)
            {
                for(String k:keys)
                {
                    if(l.equals(k))
                    {
                        faculties.add(map2.get(k));
                    }
                }
            }
            System.out.println(faculties);
        }
        else
            System.out.println("No such student");
    }
    public static void main(String[] args)
    {

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

        map1.put("A", valSetOne);
        map1.put("B", valSetTwo);
        map1.put("C", valSetThree);

        map2.put("Python", 111);
        map2.put("Maths", 222);
        map2.put("C", 333);
        map2.put("C++", 444);
        map2.put("Physics", 555);
        map2.put("Chemistry", 666);

        System.out.println("Fetching Keys and corresponding [Multiple] Values:\n");
        for (Map.Entry<String, List<String>> entry1 : map1.entrySet())
        {
            String key1 = entry1.getKey();
            List<String> values1 = entry1.getValue();
            System.out.println("Key = " + key1);
            System.out.println("Values = " + values1);
        }
        System.out.println("Fetching Keys and corresponding [Single] Values: \n");
        for (Map.Entry<String,Integer> entry2 : map2.entrySet())
        {
            String key2 = entry2.getKey();
            Integer values2 = entry2.getValue();
            System.out.println("Key = " + key2);
            System.out.println("Values = " + values2);
        }
        System.out.println("enter choice:");
        {
            Scanner sc = new Scanner(System.in);
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    Q1 c1 = new Q1();
                    List<String> val = new ArrayList<String>();
                    val.add("HPC");
                    val.add("CS");
                    val.add("DSA");
                    c1.add_in_map1("D",val);
                    break;
                case 2:
                    Q1 c2 = new Q1();
                    c2.delete_in_map1("B");
                    break;
                case 3:
                    Q1 c3 = new Q1();
                    c3.findFaculties("E");
                    break;
                default:
                    System.out.println("error");
            }
        }
    }
}