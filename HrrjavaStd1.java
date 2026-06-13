import java.util.Scanner;
public class HrrjavaStd1{
    public static void main(String[] args) {
        var sc=new Scanner(System.in);
        var integerVariable=sc.nextInt();
        var doubleVariable=sc.nextDouble();
        sc.nextLine();
        var stringVariable=sc.nextLine();
        sc.close();
        System.out.println("String:"+stringVariable+
            "\nDouble:"+doubleVariable+"\nInt:"+integerVariable);
    }
}

