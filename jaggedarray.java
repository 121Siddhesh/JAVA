class jagged{
    public static void main(String arr[]){
        int num[][]=new int [4][];
        num[0]=new int [3];
        num[1]=new int [6];
        num[2]=new int [4];
        num[3]=new int [5];

        // Assignment with random values using math.random()
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]=(int)(Math.random()*10);// Assigning random values between 0-9

            }
        }

        // Displaying the jagged array
        System.out.println("Jagged Array:");
        for(int n[]:num){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}