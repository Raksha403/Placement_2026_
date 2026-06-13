import java.util.Scanner;
public class PrintNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}