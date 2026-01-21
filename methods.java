class methodsdemo{
    public void music(){
        System.out.println("playing music..");
        

    }
    public String getmeapen(int cost){
        if (cost>=10) 
        return "pen";
        else
        return "no pen";
    }
}
class methods{
public static void main(String arr[]){
    methodsdemo md=new methodsdemo();
    md.music();
    int num=15;
    String item=md.getmeapen(num);
    System.out.println("Item received: "+item);
     int num1=5;
    String item1=md.getmeapen(num1);
    System.out.println("Item received: "+item1);
}
}