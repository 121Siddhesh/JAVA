import java.util.Scanner;
public class Multiplication{
    public static void main(String args[]){
        int num=readNumber();
        table(num);
    }
    public static int readNumber(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num=sc.nextInt();
            return num;
        }
        public static void table(int num){
            for(int i=1; i<=10; i++){
                int result=num*i;
                System.out.println(num+ "X"+i+"="+result);
            }
        }
    }
