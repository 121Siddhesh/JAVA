import java.util.Scanner;
class gcd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        int gcd=GCD(num1,num2);
        System.out.println("GCD="+gcd);

    }
    public static int GCD(int num1,int num2){
        int gcd=1;
        int i=2;
        int least=LEAST(num1,num2);
        while(i<=least){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
            i++;

        }
        return gcd;
    }
    public static int LEAST(int num1,int num2){
        if(num1<num2){
        return  num1;
        }
        else{
            return num2;
        }
    }
}