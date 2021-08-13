import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        float sum = 0.0f;
        float avg = 0.0f;
        System.out.print("enter the number of numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = sum / n;
        System.out.println("the sum is: " + sum);
        System.out.println("the average is: " + avg);
        sc.close();
    }
}
