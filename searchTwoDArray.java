import java.util.Scanner;
class searchTwoDArray{
    public static void main(String args[]){
        int[][]numArray=arrayUtility.input2dArray();
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number you want to search: ");
        int num=input.nextInt();
        if(search2dArray(numArray,num)){
            System.out.println("The number "+num+" is found in the Array.");
        }
        else{
            System.out.println("The number "+num+" is  not found in the Array.");
        }
    }
    public static boolean search2dArray(int[][]numArray,int num){
        int i=0;
        while(i<numArray.length){
            int j=0;
            while(j<numArray[i].length){
                if(numArray[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}