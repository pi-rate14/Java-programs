import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        System.out.print("Enter any string : ");
        Scanner sc = new Scanner(System.in);
        String origString = sc.nextLine();
        int length = origString.length();

        boolean isPalindrome = true;

        for (int beginIndex = 0; beginIndex < length; beginIndex++) {
            if (origString.charAt(beginIndex) != origString.charAt(length - 1 - beginIndex)) {
                System.out.println("String is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("String is a palindrome.");
        }
        sc.close();
    }

}