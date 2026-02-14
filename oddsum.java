import java.util.Scanner;
public class oddsum{
    public static void main(String args[]){
        int num=readNumber();
        oddsum(num);
    }
    public static int readNumber(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            return num;
        }
        public static void oddsum(int num){
            int sum=0;
            for(int i=1; i<=num; i++){
                if(i%2!=0){
                    sum=sum+i;
                }
            }
            System.out.println("The sum of odd numbers is: "+sum);
}
}