import java.util.Scanner;
class arrayUtility{
    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter numbers of elements: ");
        int size=input.nextInt();
        int []nums=new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter element number "+(i+1)+": ");
            nums[i]=input.nextInt();
            i++;
        }
        return nums;
    }
    public static void DisplayArray(int[]numArray){
        int i=0;
        while(i<numArray.length){
            System.out.print(numArray[i]+" ");
            i++;
        }
        System.out.println();
    }
}