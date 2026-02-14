import java.util.Scanner;
class palindromeArray{
    public static void main(String args[]){
        int []numArray=arrayUtility.inputArray();
        if(isPalindrome(numArray)){
            System.out.println("The Array is a Palindrome");
        }
        else{
            System.out.println("The Array is not a Palindrome");
        }
    }
    public static boolean isPalindrome(int[]numArray){
        int i=0;
        while(i<numArray.length/2){
            if(numArray[i]!=numArray[(numArray.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;

    }

}