import java.util.Scanner;
class armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        boolean isArmstrong=ISARMSTRONG(num);
        if(isArmstrong){
            System.out.println(num+" is an Armstrong number.");
        }
        else{
            System.out.println(num+" is not an Armstrong number.");
        }
    }
    public static boolean ISARMSTRONG(int num){
          int original = num; 
        int numDigits=numDigits(num);
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+= pow(digit,numDigits);
            num/=10;
        }
        return sum==original;
    }
    public static int numDigits(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    public static int pow(int num1,int num2){
        int result=1;
        int i=0;
        while(i<num2){
            result*=num1;
            i++;
        }
        return result;
    }

}