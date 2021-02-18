import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int ctr = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is a prime number ");
        int n = sc.nextInt();
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                ctr = 1;
                break;
            }
        }
        if (n == 1) {
            System.out.println("1 is neither prime nor composite");
        }
        if (ctr == 0) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not prime number");
        }
        sc.close();
    }
}
