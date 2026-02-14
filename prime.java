import java.util.Scanner;
class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        boolean isPrime=ISPRIME(num);
        if(isPrime){
            System.out.println(num+" is a prime number.");
        }
        else{
            System.out.println(num+" is not a prime number.");
        }
    }
    public static boolean ISPRIME(int num){
       
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}