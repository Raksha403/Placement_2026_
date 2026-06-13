import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        System.out.println("Odd numbers from 1 to " + n + " are:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}