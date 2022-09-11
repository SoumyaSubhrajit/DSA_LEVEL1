public class vegetable {
    int price;
    String ename="labo";
     void cutveg(){
        System.out.println("cut vegie");
    }
    void washveg(){
        System.out.println("wash vagie");
    }

   /* public static void main(String[] args) {
        vegetable v= new vegetable();
        v.cutveg();
        v.washveg();

    }*/
}
class patato extends  vegetable{
    String name;
    patato(String n){
        this.name = n;
        System.out.println(this.name);
    }
    @Override
    void cutveg(){
        System.out.println("kan-*ha cut vegie");
    }
    void chips(){
        System.out.println("chips..");
    }

}

class carrot extends vegetable{
    String name;
    carrot(String n){
        this.name = n;
        System.out.println(this.name);
    }
    void halwa(){

        System.out.println("halwa hain sala");
    }

    public static void main(String[] args) {
        carrot c = new carrot("cc");
        System.out.println(c.price = 60);
        c.cutveg();

            patato p = new patato("kanha");
            p.cutveg();

    }
}