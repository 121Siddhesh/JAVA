class SumOfDiagonal{
    public static void main(String args[]){
        int [][]numArray=arrayUtility.input2dArray();
        long sum=SumOfDiagonals(numArray);
        System.out.println("The sum of the diagonal elements of the 2d Array is : "+sum);

    }
    public static long SumOfDiagonals(int[][]numArray){
        long leftDiagonalSum=SumOfLeftDiagonals(numArray);
        long rightDiagonalSum=SumOfRightDiagonals(numArray);
        long sum=leftDiagonalSum + rightDiagonalSum;
        if(numArray.length%2!=0){
            int mid=numArray.length/2;
            sum-=numArray[mid][mid];
        }
        return sum;

    }
     public static long SumOfLeftDiagonals(int[][]numArray){
       
       long sum=0;
       int i=0;
       while(i<numArray.length){
        sum+=numArray[i][i];
        i++;
       }
        return sum;

    }
     public static long SumOfRightDiagonals(int[][]numArray){
       
       long sum=0;
       int i=0;
       while(i<numArray.length){
        int col=numArray[i].length-1-i;
            sum+=numArray[i][col];
            i++;
        }
        return sum;
       }
        

    }
