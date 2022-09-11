import java.util.*;
public  class count_num {
    public static void main(String[] args) {
        System.out.println("enter a number that you want count");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int store = 0;
        while (n !=0)
        {
            store = n%1000;
            System.out.println(store);
        }

    }
}




















//import  java.util.*;
//public class count_num {
//    public static void main(String[] args) {
//        System.out.println("enter your desire number");
//        Scanner sc = new Scanner(System.in);
//        int n  = sc.nextInt();
//        int [] arr= new int[15];
//        for (int j = 0; j< n;j++)
//        {
//            arr[j] = sc.nextInt();
//        }
//
//        int count = 0;
//        for (int i =0 ; i < arr.length; i++)
//        {
//            System.out.println(arr.length);
//            if(arr[i] >= 0)
//            {
//                count++;
//            }
//        }
//        System.out.println("Count of your given number is");
//        System.out.println(count);
//    }
//}
