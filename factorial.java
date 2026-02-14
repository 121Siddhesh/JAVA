import java.util.Scanner;
public class factorial{
    public static void main(String args[]){
        int num=readNumber();
       long fact=factorial(num);
    System.out.println("The Factorial of a numbers is: "+fact);
    }
    public static int readNumber(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            return num;
        }
        public static long factorial(int num){
            if(num<2){
                return 1;
            }
            long fact=1;
            int i=1;
            while(i<=num){
                fact*=i;
                i++;
          
            }
            return fact;
            

}
}