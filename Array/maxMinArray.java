import java.util.Scanner;
class MaxMin{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int []numArray=arrayUtility.inputArray();
        int max=max(numArray);
        int min=min(numArray);
        System.out.println("Maxmimun no in the array is: "+max);
        System.out.println("Minimum no in the array is: "+min);

    }
    public static int max(int[] numArray){
        if(numArray.length==0){
        return Integer.MIN_VALUE;
      }
        int i=0;
         int max=numArray[i];
        while(i<numArray.length){
            if(numArray[i]>max){
                max=numArray[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] numArray){
      
      if(numArray.length==0){
        return Integer.MIN_VALUE;
      }
        int i=0;
        int min=numArray[i];
        while(i<numArray.length){
            if(numArray[i]<min){
                min=numArray[i];
            }
            i++;
        }
        return min;
    }
}