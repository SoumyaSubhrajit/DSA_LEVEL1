import java.util.Scanner;
public class if_condition
{
    public static void main(String[] args) {
        System.out.println("enter your marks");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks >90){
            System.out.println("Excellent");
        }
        else if (80<marks && marks<=90)
        {
            System.out.println("good");
        }
        else if (70<marks && marks<=80)
        {
            System.out.println("fair");
        }
        else if (60<marks && marks<=70)
        {
            System.out.println("meet expectaion");
        }
        else{
            System.out.println("below fair");
        }
    }
}
