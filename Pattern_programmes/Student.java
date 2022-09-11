public class Student {
    String name;
    double perc;
    String qual;
    int     yop;



     Student(String n ,double b, String q , int y){
        this.name = n;
        this.perc = b;
        this.qual = q;
        this.yop =  y;
    }
    boolean details()
    {
        System.out.println("Name = "+this.name);
        System.out.println("Qualificaion = "+this.qual);
        System.out.println("Percentage = "+this.perc);
        System.out.println("YOP = "+this.yop);
     return  false;
    }

    public static void main(String[] args) {
        Student s1 = new Student("kanha",7.74,"b-tech",2021);
        Student s2 = new Student("budha", 8.45, "b-tech", 2022);
        Student s3 = new Student("lucky", 7.98, "civil", 2021);
        Student x[] = {s1,s2,s3};
        for(int i = 0;i<x.length;i++){
            System.out.println(x[i].details());

        }

    }
}
