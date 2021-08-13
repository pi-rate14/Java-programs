package com.apoorva;

import java.util.*;

class Tourist {
    private String name;
    private String state;
    private String touristSpot;

    public Tourist(String name, String state, String touristSpot) {
        this.name = name;
        this.state = state;
        this.touristSpot = touristSpot;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getTouristSpot() {
        return touristSpot;
    }

}

class spotNotFound extends Exception {
    public spotNotFound(String s) {
        super(s);
    }
}

class SortByState implements Comparator<Tourist> {

    @Override
    public int compare(Tourist a, Tourist b) {
        return a.getState().compareTo(b.getState());
    }

}

public class Q2 {
    static Integer c = 0;

    public static void main(String[] args) throws spotNotFound {
        List<Tourist> tourists = new ArrayList<>();
        Tourist obj1 = new Tourist("Name1", "Tamil Nadu", "Kodaikanal");
        Tourist obj2 = new Tourist("Name2", "Karnatka", "Hampi");
        Tourist obj3 = new Tourist("Name3", "Kerala", "Munnar");
        Tourist obj4 = new Tourist("Name4", "Telangana", "Warangal");
        Tourist obj5 = new Tourist("Name5", "Andhra Pradesh", "Visakhapatnam");
        Tourist obj6 = new Tourist("Name6", "Andaman", "Havelock");
        Tourist obj7 = new Tourist("Name7", "Lakshwadeep", "Minicoy");
        tourists.add(obj1);
        tourists.add(obj2);
        tourists.add(obj3);
        tourists.add(obj4);
        tourists.add(obj5);
        tourists.add(obj6);
        tourists.add(obj7);
        System.out.println("List in sorted order: ");
        Collections.sort(tourists, new SortByState());
        tourists.forEach(tourist -> {
            System.out.println("Name:" + tourist.getName() + " | State:" + tourist.getState() + " | Tourist Spot:"
                    + tourist.getTouristSpot());
        });
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the tourist spot: ");
        String spot = sc.nextLine();
        tourists.forEach(tourist -> {
            if (spot.equalsIgnoreCase(tourist.getTouristSpot())) {
                System.out.println("Tourist spot exists.");
                System.out.println("Name:" + tourist.getName());
                System.out.println("State:" + tourist.getState());
                System.out.println("Tourist Spot:" + tourist.getTouristSpot());
                c = 1;
            }
        });
        if (c != 1)
            throw new spotNotFound("The tourist spot " + spot + " does not exist");
    }

}