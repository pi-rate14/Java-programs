import java.util.Scanner;

public class Q11 {

    public static String insertString(String originalString, String stringToBeInserted, int index) {

        String newString = new String();

        for (int i = 0; i < originalString.length(); i++) {
            newString += originalString.charAt(i);

            if (i == index) {
                newString += stringToBeInserted;
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial string");
        String str = sc.nextLine();
        do {
            System.out.println("1- Append a string");
            System.out.println("2- Insert a string");
            System.out.println("3- delete a portion of the string");
            System.out.println("0- exit");
            System.out.println("------------------------------");
            System.out.print("Select your choice=");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
            case 1:
                System.out.print("Enter string to append");
                String temp = sc.nextLine();
                str = str + temp;
                System.out.println("String after appending: " + str);
                break;
            case 2:
                System.out.print("Enter string to be inserted");
                temp = sc.nextLine();
                System.out.print("Enter index at which it should be inserted");
                int index = sc.nextInt();
                System.out.println("Modified String: " + insertString(str, temp, index));
                break;
            case 3:
                System.out.print("Enter substring to be deleted");
                temp = sc.nextLine();
                str = str.replace(temp, "");
                System.out.println("modified string: " + str);
                break;
            default:
                System.out.print("Enter valid choice.");
            }
        } while (choice != 0);
    }

}