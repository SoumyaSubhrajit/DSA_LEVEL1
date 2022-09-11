public class Employee {
    String name;
    int price;
    String comp;
     Employee(String n, int p, String c){
        this.name = n;
        this.price = p;
        this.comp = c;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("kanha",25000,"Strtups");
        Employee e2  = new Employee("budha", 30000, "wipro");
        Employee e3  = new Employee("bhondu", 40000, "congizent");

        Employee x[] = {e1,e2,e3};
        for(int i = 0; i<x.length;i++){
            System.out.println(x[i].name+x[i].price+x[i].comp);
        }


    }
}
