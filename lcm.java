import java.util.Scanner;
class lcm{
    public static void main(String args[]){
        int num1=readNumber();
        int num2=readNumber();
         int lcm=LCM(num1,num2);   
        System.out.println("Lcm="+lcm);
    }
    public static int readNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        return num;
    }
    public static int LCM(int num1,int num2){
        int i=1;
        while(true){
           int  factorial = num1 * i ;{
            if(factorial % num2==0)
                return factorial;
            }    
            i++;
        }
    }
}