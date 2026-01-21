
class addition{
    int add(int a,int b){
       int  r=a+b;
        return r;

    }
}

class classdemo{
    public static void main(String arr[]){
        int num1=10;
        int num2=20;

        addition add=new addition();//object is created of addition class
        int result=add.add(num1,num2);
        System.out.println("Addition is: "+result);
    }
}