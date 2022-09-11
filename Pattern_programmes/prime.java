import java.util.*;
public class prime {
    public static void main(String[] args) {
        System.out.println("Enter 5 number that you want to see prime number");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
System.out.println("enter int numbers");

        for (int i = 1; i <= t; i++)
        {
            int n = sc.nextInt();
            int fac = 0;
            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    fac++;
                }
            }

            if (fac == 2)
            {
                System.out.println("it's a prime number");
            } else
            {
                System.out.println("it's not a prime number");

            }
        }
    }
}


