import java.util.Scanner;

public class prime_low_high {
    public static void main(String[] args) {

        System.out.println("enter a low digit number");
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        System.out.println("enter higher digit number");
        int high = sc.nextInt();
        for (int i =low;i<=high;i++)
        {
            int fac = 0;
            for (int j = 2; j * j <= i; j++)
            {
                if (i % j == 0)
                {
                    fac++;
                   break;
                }

            }
                if (fac == 0)
                {
                    System.out.println(i);
                }


        }
    }
}
