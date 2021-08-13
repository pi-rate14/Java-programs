import java.util.Scanner;

public class Q8 {

    int SearchNumber(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return SearchNumber(arr, l, mid - 1, x);
            return SearchNumber(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the sorted array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int search = sc.nextInt();
        Q8 object = new Q8();
        int result = object.SearchNumber(numbers, 0, n - 1, search);
        System.out.println("The number is at index " + result);
        sc.close();
    }
}
