import java.util.Scanner;
class interest{
    public static void main(String arr[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Calculate Simple and Compound Interest");
        System.out.print("Enter Principal Amount:");
        double principal=input.nextDouble();
        System.out.print("Enter Rate of Interest:");
        double rate=input.nextDouble();
        System.out.print("Enter Time in Years:");
        double time=input.nextDouble();

        double simpleInterest=(principal*rate*time)/100;
        System.out.println("Simple Interest is:"+simpleInterest);

        double compoundInterest=principal * ((1 + rate / 100)*time) ;
        System.out.println("Compound Interest is:"+compoundInterest);
    }
}