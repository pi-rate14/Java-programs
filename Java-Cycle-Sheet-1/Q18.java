import java.util.Scanner;

class Telephone {
    Scanner sc = new Scanner(System.in);
    String name;
    String number;

    Telephone(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number" + number);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}

class TelephoneIndex extends Telephone {

    TelephoneIndex(String name, String number) {
        super(name, number);
    }

    public void changeName() {
        System.out.println("Enter new name: ");
        name = sc.nextLine();
    }

    public void changeNumber() {
        System.out.println("Enter new number: ");
        number = sc.nextLine();
    }

}

public class Q18 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        TelephoneIndex[] arr = new TelephoneIndex[5];
        System.out.println("Enter the values for 5 people");
        for (int i = 0; i < 5; i++) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("For customer" + (i + 1));
            System.out.println("Name: ");
            String name = sc2.nextLine();
            System.out.println("Number: ");
            String number = sc2.nextLine();
            arr[i] = new TelephoneIndex(name, number);
        }
        int choice = 1;
        do {
            System.out.println("1.Search for a Customer");
            System.out.println("2.Change Customer Name");
            System.out.println("3.Change Customer Number");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            choice = sc1.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Enter name or the first few characters");
                Scanner sc3 = new Scanner(System.in);
                String val = sc3.nextLine();
                for (int i = 0; i < 5; i++) {
                    String temp = arr[i].getName();
                    if (temp.equals(val) || temp.startsWith(val)) {
                        arr[i].display();
                    }
                }
                break;
            case 2:
                System.out.println("Enter Name of the customer ");
                Scanner sc4 = new Scanner(System.in);
                String val1 = sc4.nextLine();
                for (int i = 0; i < 5; i++) {
                    String temp = arr[i].getName();
                    if (temp.equals(val1)) {
                        arr[i].changeName();
                    }
                }
                break;
            case 3:
                System.out.println("Enter Name of the customer ");
                Scanner sc5 = new Scanner(System.in);
                String val2 = sc5.nextLine();
                for (int i = 0; i < 5; i++) {
                    String temp = arr[i].getName();
                    if (temp.equals(val2)) {
                        arr[i].changeNumber();
                    }
                }
                break;
            case 4:
                for (int i = 0; i < 5; i++) {
                    System.out.println("Customer " + (i + 1));
                    arr[i].display();
                }
                break;
            case 5:
                break;
            default:
                System.out.println("Wrong option");
            }
        } while (choice != 5);

    }

}