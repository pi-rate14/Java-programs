import java.util.Scanner;

class Convert {
    Scanner scan;
    int num;

    void getVal() {
        System.out.println("Decimal to HexaDecimal,Octal and Binary");
        scan = new Scanner(System.in);
        System.out.println("\nEnter the number :");
        num = Integer.parseInt(scan.nextLine());
    }

    void convert() {
        String hexa = Integer.toHexString(num);
        System.out.println("HexaDecimal Value is : " + hexa);
        String octal = Integer.toOctalString(num);
        System.out.println("Octal Value is : " + octal);
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary Value is : " + binary);
    }
}

public class Q10 {
    public static void main(String args[]) {
        Convert obj = new Convert();
        obj.getVal();
        obj.convert();
    }
}
