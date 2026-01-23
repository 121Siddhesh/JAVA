class Human{
    private int age;//Encapsulated variable
    private String name;//Encapsulated variable
    public int getAge(){//Getter method
        return age;
    }
    public void setAge(int a){//Setter method
        age=a;

    }
    public String getName(){
        return name;

    }
    public void setName(String n){
        name=n;
    }
}

class Encap{
    public static void main(String arr[]){
        Human h =new Human();
        h.setAge(20);
        h.setName("Siddhesh");
        System.out.println("Name: "+h.getName());
        System.out.println("Age: "+h.getAge());

        System.out.println("--------");

        Human h2=new Human();
        h2.setAge(21);
        h2.setName("Harsh");
        System.out.println("Name: "+h2.getName());
        System.out.println("Age: "+h2.getAge());
    }
}