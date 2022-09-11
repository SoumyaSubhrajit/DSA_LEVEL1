import java.util.Scanner;

public class rotation_num {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter a the rotaion number");
        int k = sc.nextInt();
        int temp = 0;
        int digit = 0;
        temp = n ;
        while(temp >0)
        {
            temp = temp / 10; // it's gives us count of digit
            digit++;
        }
        System.out.println(digit);
        k = k % digit;  // for large number it cal the reminder value
        if (k < 0)
        {
            k = k + digit;
        }
        int div = 1;
        int mul = 1;
        for (int i = 1; i<=digit; i++)
        {
            if(i<=k)
            {
                div= div * 10;  // this itration gives us div -division value in form pow(10)
            }
            else {
                mul = mul * 10; // it will give us the pow(10) that we add in the rotayioj value
            }
        }
        int q = n/div;
        int r = n % div;
        int rot = r* mul + q;
        System.out.println(rot);
    }
}
