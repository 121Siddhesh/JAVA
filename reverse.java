import java.util.Scanner;
class reverse{
    public static void main(String args[]){
        int[]numArray=arrayUtility.inputArray();
        reverseArray(numArray);
        System.out.print("Here is your reversed Array: ");
        arrayUtility.DisplayArray(numArray);
    }
    public static void reverseArray(int[]numArray){
        int i=0;
        while(i<numArray.length/2){
            int swap=numArray[i];
            numArray[i]=numArray[(numArray.length-1)-i];
            numArray[(numArray.length-1)-i]=swap;
            i++;
        }
       
    }
}