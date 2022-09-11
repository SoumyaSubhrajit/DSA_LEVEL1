import  java.util.*;

public class Main{
    public static void main(String[] args)
    {
        System.out.println("enter a int digit that ypu want to see prime or not");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i<=t; i++)
        {
            int n = sc.nextInt();
            int fac = 0;
            for (int j = 2; j*j<=n; j++)
            {
                if(n%j ==0 )
                {
                    fac++;
                    break;
                }
            }
            if(fac ==1)
            {
                System.out.println("it's not a prime number");
            }
            else
            {
                System.out.println("it's a prime");

            }
        }
    }
}