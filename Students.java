import java.util.Scanner;

class Student {
    String name;
    String usn;
    String email;

    Student(String name, String usn, String email) {
        this.name = name;
        this.usn = usn;
        this.email = email;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("USN  : " + usn);
        System.out.println("Email: " + email);
    }
}

public class Students {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter USN: ");
            String usn = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            students[i] = new Student(name, usn, email);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}