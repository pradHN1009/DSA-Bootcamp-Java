import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the position of Fibonacci sequence you want");
        int n = in.nextInt();
        int a  = 0;
        int b = 1;
        int count, temp;
        for(count = 2; count <= n; count++)
        {
            temp = b;
            b = b + a;
            a = temp;
        }
        System.out.println(b);
    }
}