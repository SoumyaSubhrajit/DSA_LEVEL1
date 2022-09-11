/*
import java.util.Scanner;

public class pythagoren_triplets {
    public static void main(String[] args) {
        System.out.println("enter the first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter the third number");
        int c = sc.nextInt();
        int max = a;
        if(b>=max){
            max =b;
        }
        if(c >=max){
            max =c;
        }

        if(max == a){
            boolean flag = (b*b + c*c) == (a*a);
            System.out.println(flag);
        }
        if(max == b){
            boolean flag = (a*a + c*c) == (b*b);
            System.out.println(flag);
        }
        if(max == c){
            boolean flag = (b*b + a*a) == (c*c);
            System.out.println(flag);
        }

    }
}
*/

import java.util.Scanner;

public class pythagoren_triplets {
    public static void main(String[] args) {
        System.out.println("enter the first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter the third number");
        int c = sc.nextInt();

        if(a>=b && a>=c)
        {
            boolean flag = (b*b + c*c) == (a*a);
            System.out.println(flag);
        }
        if(b>=a && b>=c)
        {
            boolean flag = (a*a + c*c) == (b*b);
            System.out.println(flag);
        }
        if(c >= a && c>=b){
            boolean flag = (b*b + a*a) == (c*c);
            System.out.println(flag);
        }

        }

    }


