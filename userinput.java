import java.util.Scanner;
class user{
    public static void main(String agrs[]){
        System.out.print("Enter You name: ");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        System.out.println("Hello, "+name);
        System.out.println("ADDITION OF TWO NUMBERS");
        System.out.print("Enter a number1: ");
        int num1=input.nextInt();
        System.out.print("Enter a number2: ");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("The sum is: "+sum);
    }
}