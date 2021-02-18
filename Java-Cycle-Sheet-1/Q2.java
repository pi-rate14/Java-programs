import java.util.Scanner;
import java.lang.Math;

public class Q2 {
    public static void main(String[] args) {
        int digits = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is armstrong number 1");
        int n = sc.nextInt();
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        temp = n;
        while (temp != 0) {
            int unit = temp % 10;
            temp = temp / 10;
            sum += Math.pow(unit, digits);
        }
        if (sum == n) {
            System.out.println("Yes, it is an armstrong number");
        } else {
            System.out.println("no it is not an armstrong number");
        }
        sc.close();
    }
}
