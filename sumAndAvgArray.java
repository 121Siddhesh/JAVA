class sumAvg{
    public static void main(String args[]){
        int[]numArray=arrayUtility.inputArray();

        long sum=sum(numArray);
        double avg=avg(numArray);
        System.out.println("Sum of the numbers in an array: "+sum);
        System.out.println("Average of the numbers in an array: "+avg);


    }
    public static long sum(int[]numArray){
        long sum=0;
        int i=0;
        while(i<numArray.length){
            sum=sum+numArray[i];
            i++;

        }
        return sum;

    }
    public static double avg(int[]numArray){
        long sum=sum(numArray);

        return (double)sum/numArray.length;

    }

}