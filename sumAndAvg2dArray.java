class sumAndAvg2dArray{
    public static void main(String args[]){
        int [][]numArray=arrayUtility.input2dArray();
        long sum=Sum(numArray);
        double avg=Avg(numArray);
        System.out.println("The sum of the 2d Array is : "+sum);
        System.out.println("The average of the 2d Array is : "+avg);
    }
    public static long Sum(int[][]numArray){
        int i=0;
        long sum=0;
        while(i<numArray.length){
            int j=0;
            while(j<numArray[i].length){
                sum+=numArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double Avg(int[][]numArray){
        if(numArray.length==0){
            return 0;
        }
        int row=numArray.length;
        int col=numArray[0].length;
        double size=row*col;
        return Sum(numArray)/size;
    }
}