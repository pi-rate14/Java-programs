import java.util.Scanner;

class Items {
    private String item_name;
    private int quantity;
    private double price;
    private double total_cost;

    Items() {
    }

    Items(String item_name, int quantity, double price) {
        this.item_name = item_name;
        this.quantity = quantity;
        this.price = price;
        total_cost = 0;
    }

    public String get_item_name() {
        return item_name;
    }

    public int get_quantity() {
        return quantity;
    }

    public double get_price() {
        return price;
    }

    public double get_total_cost() {
        return total_cost;
    }

    public void set_total_cost() {
        total_cost = this.quantity * this.price;
    }
}

class Invoice extends Items {
    public double bill(Items[] list) {
        double total_bill = 0;
        System.out.println("Name \t\t Quantity \t Price \t\t Total");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].get_item_name() + " \t\t " + list[i].get_quantity() + " \t\t "
                    + list[i].get_price() + " \t\t " + list[i].get_total_cost());
            total_bill += list[i].get_total_cost();
        }
        return total_bill;
    }
}

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of items: ");
        int numOfItems = sc.nextInt();

        Items[] itemobj = new Items[3];
        for (int i = 0; i < numOfItems; i++) {
            sc.nextLine();
            System.out.println("Enter Item Name: ");
            String iname = sc.nextLine();
            System.out.println("Enter Item Quantity: ");
            int quan = sc.nextInt();
            System.out.println("Enter Item Price: ");
            double iprice = sc.nextDouble();
            itemobj[i] = new Items(iname, quan, iprice);
            itemobj[i].set_total_cost();
        }
        Invoice invobj = new Invoice();
        System.out.println("\nThe total bill is: " + invobj.bill(itemobj));
    }
}