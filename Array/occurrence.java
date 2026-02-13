import java.util.Scanner;
class occurrence{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        int []numArray=arrayUtility.inputArray();
        System.out.print("Enter the number you want to find: ");
        int num=input.nextInt();
        int occur=Occurrence(numArray,num);
        System.out.print("The number "+num+" is found "+occur+" times in the array. ");

    }
    public static int Occurrence(int[]numArray,int num){
        int count=0;
        int i=0;
        while(i<numArray.length){
            if(numArray[i]==num){
            count++;
            
            }
            i++;
       
        }
        return count;
    }


}