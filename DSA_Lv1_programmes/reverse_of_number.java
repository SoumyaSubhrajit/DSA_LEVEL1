import java.util.Scanner;

public class reverse_of_number {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while( n != 0)
        {
           int temp = n % 10;
            System.out.println(temp);
            n = n / 10 ;
        }
    }
}
