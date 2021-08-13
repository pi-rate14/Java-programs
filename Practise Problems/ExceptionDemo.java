public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int i = 9 / 0;
        } catch (Exception e) {
            System.err.println("error ");
        }

        System.out.println("BYE");
    }
}