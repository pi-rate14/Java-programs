import java.util.Scanner;

interface Arithmetic<T> {
    void add(T a, T b);

    void sub(T a, T b);

    void multiply(T a, T b);

    void divide(T a, T b);

}

class FloatValues implements Arithmetic<Float> {

    @Override
    public void add(Float a, Float b) {
        System.out.println(a + " + " + b + " = " + (a + b));

    }

    @Override
    public void sub(Float a, Float b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    @Override
    public void multiply(Float a, Float b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    @Override
    public void divide(Float a, Float b) {
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
}

class IntegerValues implements Arithmetic<Integer> {

    @Override
    public void add(Integer a, Integer b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    @Override
    public void sub(Integer a, Integer b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    @Override
    public void multiply(Integer a, Integer b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    @Override
    public void divide(Integer a, Integer b) {
        if (b != 0)
            System.out.println(a + " / " + b + " = " + (a / b));
    }
}

public class Q20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first float number");
        float num1 = sc.nextFloat();
        System.out.println("Enter second float number");
        float num2 = sc.nextFloat();
        System.out.println("Enter first integer number");
        int num3 = sc.nextInt();
        System.out.println("Enter second integer number");
        int num4 = sc.nextInt();
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
        Arithmetic a1 = new FloatValues();
        System.out.println("Float arithmetic: ");
        a1.add(num1, num2);
        a1.sub(num1, num2);
        a1.multiply(num1, num2);
        a1.divide(num1, num2);
        a1 = new IntegerValues();
        System.out.println("Integer arithmetic: ");
        a1.add(num3, num4);
        a1.sub(num3, num4);
        a1.multiply(num3, num4);
        a1.divide(num3, num4);
    }

}