class Mobile{
    String brand;
    int price;
    static String name;//common for both objects m1 and m2
    public void display(){
        System.out.println("Brand: "+brand+", Price: "+price+", Name: "+name);
    }

}
class staticdemo{
    public static void main(String arr[]){
        Mobile m1=new Mobile();
        m1.brand="Samsung";
        m1.price=90000;
        Mobile.name="Smartphone";//common for both objects m1 and m2
        m1.display();

        Mobile m2=new Mobile();
        m2.brand="Apple";
        m2.price=120000;
        m2.display();
    }
}