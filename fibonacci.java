import java.util.Scanner;
class fibo{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Fibonacci series: ");
        printFibonacci(num);
    }
    public static void printFibonacci(int num){
        
        if(num<=0){
            return;
        }
        System.out.print(0+" ");
        if(num==0){
            return;
        }
        System.out.print(1+" ");
        int a=0,b=1;
        while (a+b<=num){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }    
    
}
}