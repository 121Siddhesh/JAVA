class addition{
    public int add(int a,int b){
        return a+b;

    }
    public int add(int a ,int b,int c){
        return a+b+c;
    }
    public double add(double a ,int b,int c){
        return a+b+c;
    }
}
class mdo{
    public static void main (String arr[]){
        int num=10;
        int num1=20;
        int num2=30;

        addition add=new addition();
        int r=add.add(num,num1);
        System.out.println("addition= "+r);
     
        int r1=add.add(num,num1,num2);
        System.out.println("addition= "+r1);
    }
}