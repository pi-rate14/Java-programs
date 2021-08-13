import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1- Compare 2 strings");
            System.out.println("2- get character in specified position");
            System.out.println("3- extract a substring");
            System.out.println("4- replace character with given character");
            System.out.println("5- get position of specified substring");
            System.out.println("0- exit");
            System.out.println("------------------------------");
            System.out.print("Select your choice = ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
            case 1:
                System.out.print("Enter first string: ");
                String temp1 = sc.nextLine();
                System.out.print("Enter second string: ");
                String temp2 = sc.nextLine();
                if (temp1.compareTo(temp2) > 0) {
                    System.out.println(temp1 + " is lexicographically greater than " + temp2);
                } else if (temp1.compareTo(temp2) < 0) {
                    System.out.println(temp1 + " is lexicographically is lesser than " + temp2);
                } else {
                    System.out.println(temp1 + " is lexicographically is equal to " + temp2);
                }
                break;
            case 2:
                System.out.print("Enter string: ");
                temp1 = sc.nextLine();
                System.out.print("Enter index at which character is searched: ");
                int index = sc.nextInt();
                sc.nextLine();
                System.out.println("character at index: " + temp1.charAt(index));
                break;
            case 3:
                System.out.print("Enter string: ");
                temp1 = sc.nextLine();
                System.out.print("Enter starting index of substring: ");
                int s_i = sc.nextInt();
                System.out.print("Enter ending index of substring: ");
                int e_i = sc.nextInt();
                if (s_i >= 0 && e_i <= temp1.length())
                    System.out.println("substring: " + temp1.substring(s_i, e_i));
                else
                    System.out.println("Wrong index inputs");
                break;
            case 4:
                System.out.print("Enter string: ");
                temp1 = sc.nextLine();
                System.out.print("Enter character to be replaced: ");
                char c1 = sc.nextLine().charAt(0);
                System.out.print("Enter character to be inserted in its place: ");
                char c2 = sc.nextLine().charAt(0);
                String s2 = "";
                for (int i = 0; i < temp1.length(); i++) {
                    if (temp1.charAt(i) != c1)
                        s2 += temp1.charAt(i);
                    else
                        s2 += c2;

                }
                System.out.println("New string: " + s2);
                break;
            case 5:
                System.out.print("Enter string: ");
                temp1 = sc.nextLine();
                System.out.println("Enter substring to find the position of: ");
                String substr = sc.nextLine();
                System.out.println(temp1.indexOf(substr));
                break;
            default:
                System.out.print("Enter valid choice.");
            }
        } while (choice != 0);
    }

}