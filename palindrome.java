import java.util.Scanner;
class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        boolean isPalindrome=isPalindrome(num);
        if(isPalindrome){
            System.out.println(num+" is a palindrome.");
        }
        else{
            System.out.println(num+" is not a palindrome.");
        }
    }
    public static int REVERSE(int num){
        int newNum=0;
        while(num>0){
            newNum=newNum*10+num%10;
            num/=10;
        }
        return newNum;
    }
    public static boolean isPalindrome(int num){

       int newNum=REVERSE(num);
         return num==newNum;
    }
}