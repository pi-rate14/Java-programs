public class Q5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

        int space = 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < space; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println(" ");
            space--;
        }
        space = 2;
        for (int i = 2; i > 0; i--) {
            for (int j = 0; j < space; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println(" ");
            space++;
        }
    }
}
