import java.util.Scanner;
class rev{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int rev=REVERSE(num);
        System.out.println("Reverse of the number is: "+rev);
    }
    public static int REVERSE(int num){
        int newNum=0;
        while(num>0){
            newNum=newNum*10+num%10;
            num/=10;
        }
        return newNum;
    }
}