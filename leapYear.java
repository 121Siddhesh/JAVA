import java.util.Scanner;
class leapYear{
    public static void main(String arr[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Leap Year Checker");
        System.out.print("Enter a year:");
        int year=input.nextInt();
        if((year %4==0 && year%100!=0) ||(year%400==0)){
            System.out.println(year+" is a Leap Year.");
        }
        else{
            System.out.println(year+" is not a Leap Year.");
        }
    }
}