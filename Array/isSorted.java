import java.util.Scanner;
class Sorted{
    public static void main(String args[]){
        int [] numArray=arrayUtility.inputArray();

        boolean isinc=isInc(numArray);
        boolean isdec=isDec(numArray);

        if(isinc || isdec){
            System.out.print("Array is Sorted.");
        }
        else{
            System.out.print("Array is not Sorted.");
        }

    }
    public static boolean isInc(int []numArray){
        int i=1;
        while(i<numArray.length){
            if(numArray[i]<numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDec(int []numArray){
        int i=1;
        while(i<numArray.length){
            if(numArray[i]> numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}