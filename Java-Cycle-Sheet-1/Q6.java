import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of terms needed: ");
        int num = sc.nextInt();
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 0; i < num - 2; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp + " ");
        }
        sc.close();
    }
}
