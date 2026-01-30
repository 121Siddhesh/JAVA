import java.util.Scanner;
class swap{
    public static void main(String arr[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=input.nextInt();
        System.out.print("Enter second number:");
        int b=input.nextInt();
        System.out.println("Before swapping: a="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: a="+a+" b="+b);
    }
}