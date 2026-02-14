import java.util.Scanner;
class delete{
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);

        int []numArray=arrayUtility.inputArray();
        System.out.print("Enter num to be deleated: ");
        int num=input.nextInt();
        int [] newArray=deleteNumber(numArray,num);
        System.out.print("Here is your new Array: ");
        arrayUtility.DisplayArray(newArray);
    }
    public static int[]deleteNumber(int[]numArray,int num){
        int occr=occurrence.Occurrence(numArray,num);
        if(occr==0){
            return numArray;
        }
        int newSize=numArray.length-occr;
        int []newArray=new int [newSize];
        
        int i=0,j=0;
        while(i<numArray.length){
            if(numArray[i] != num){
                newArray[j]=numArray[i];
                j++;
            }
            i++;
        }
        return newArray;

    }
}