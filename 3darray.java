class threeDarray{
    public static void main(String arr[]){
        int num[][][]=new int [2][3][4];
        // Assignment with random values using math.random()
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<4;k++){
                    num[i][j][k]=(int)(Math.random()*10);

                }
            }
        }

        // Displaying the 3D array
        System.out.println("3D Array:");
          for(int n[][]:num){
            for(int m[]:n){
                for(int o:m){
                   System.out.print(o+" ");

                }
                System.out.println();
            }
            System.out.println();
        }

    }
}