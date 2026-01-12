import java.util.Scanner;

public class CollegeEntry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("College Entry System");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Department: ");
        sc.nextLine();
        String department = sc.nextLine();

        System.out.println("Student Entry Successful");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + roll);
        System.out.println("Department : " + department);

        sc.close();
    }
}
