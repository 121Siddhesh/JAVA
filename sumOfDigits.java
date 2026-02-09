import java.util.Scanner;
public class sumOfDigits{
    public static void main(String args[]){
        int num=readNumber();
        sumOfDigits(num);
        System.out.println("The sum of digits is: "+sumOfDigits(num));
    }
    public static int readNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        return num;
    }
    public static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
            
        }
        return sum;
    }
}