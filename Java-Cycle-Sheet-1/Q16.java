import java.util.Scanner;

class Student {
    String Regno;
    String name;
    String branch;
    int year;
    String semester;
    float physics;
    float maths;
    float english;
    float chemistry;
    float biology;

    Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter registration number ");
        Regno = sc.nextLine();
        System.out.println("Enter name ");
        name = sc.nextLine();
        System.out.println("Enter branch ");
        branch = sc.nextLine();
        System.out.println("Enter semester ");
        semester = sc.nextLine();
        System.out.println("Enter year ");
        year = sc.nextInt();
        System.out.println("Enter marks in physics: ");
        physics = sc.nextFloat();
        System.out.println("Enter marks in chemistry: ");
        chemistry = sc.nextFloat();
        System.out.println("Enter marks in biology: ");
        biology = sc.nextFloat();
        System.out.println("Enter marks in maths: ");
        maths = sc.nextFloat();
        System.out.println("Enter marks in english: ");
        english = sc.nextFloat();
    }

    float percentage() {
        float sum = 0.0f, percentage = 0.0f;
        sum = physics + chemistry + maths + english + biology;
        percentage = (sum / 5);
        return percentage;
    }

    void marksheet() {
        System.out.println("Name of Student: " + name);
        System.out.println("registration number: " + Regno);
        System.out.println("branch: " + branch);
        System.out.println("year: " + year);
        System.out.println("semester: " + year);
        System.out.println("marks in physics: " + physics);
        System.out.println("marks in chemistry: " + chemistry);
        System.out.println("marks in biology: " + biology);
        System.out.println("marks in maths: " + maths);
        System.out.println("marks in english: " + english);
        System.out.println("percentage: " + percentage() + "%");
    }
}

public class Q16 {
    public static void main(String args[]) {
        Student obj1 = new Student();
        obj1.marksheet();
    }
}
