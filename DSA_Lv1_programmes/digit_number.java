import java.util.Scanner;

public class digit_number {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long temp;
        long digit = 1;
        int pow = 1;
        temp =  n;
        while(temp != 0)
        {
            temp = temp / 10;
            pow = pow * 10;
        }
        pow = pow /10;
        temp = n;
        while( pow > 0)
        {
            digit = temp / pow;
            System.out.println(digit);
            temp = temp % pow;
            pow  = pow /10;
        }
    }
}
