import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

abstract class BankAccount {
    private static final AtomicInteger count = new AtomicInteger(0);
    String name;
    String DOB;
    String address;
    int accno;
    int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String dOB) {
        DOB = dOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAccno() {
        return accno;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void delete() {
        name = null;
        DOB = null;
        address = null;
        accno = 0;
        balance = 0;
    }

    public BankAccount() {
        accno = count.incrementAndGet();
    }
}

class SavingsAccount extends BankAccount {
    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

public class Q19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int choice = 1;
        SavingsAccount obj = new SavingsAccount();
        do {
            System.out.println("1.Create a new account");
            System.out.println("2.Perform Deposit");
            System.out.println("3.Perform Withdraw");
            System.out.println("4.Display");
            System.out.println("5.Delete");
            System.out.println("6.Exit");
            System.out.println("Enter Choice ");
            choice = sc1.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Enter Name: ");
                String name = sc.nextLine();
                obj.setName(name);
                System.out.println("Enter DOB: ");
                String DOB = sc.nextLine();
                obj.setDOB(DOB);
                System.out.println("Enter Address: ");
                String address = sc.nextLine();
                obj.setAddress(address);
                System.out.println("Enter Balance: ");
                int balance = sc.nextInt();
                obj.setBalance(balance);
                break;
            case 2:
                System.out.println("Enter Deposit amount: ");
                int amount = sc.nextInt();
                obj.deposit(amount);
                break;
            case 3:
                System.out.println("Enter Withdraw amount: ");
                int amount1 = sc.nextInt();
                obj.withdraw(amount1);
                break;
            case 4:
                System.out.println("Account number: " + obj.getAccno());
                System.out.println("Name: " + obj.getName());
                System.out.println("DOB: " + obj.getDOB());
                System.out.println("Address: " + obj.getAddress());
                System.out.println("Balance: " + obj.getBalance());
                break;
            case 5:
                obj.delete();
                break;
            case 6:
                break;
            default:
                System.out.println("Wrong Value");
                break;
            }
        } while (choice != 6);
    }

}