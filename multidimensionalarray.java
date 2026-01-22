class mdarray{
    public static void main(String arr[]){
        int num[][]=new int [3][4];
        // Assignment with random values using math.random()
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                num[i][j]=(int)(Math.random()*10);// Assigning random values between 0-9
            }
        }

                    System.out.println("Using normal for loop:");//using normal for loop
                    for(int i=0;i<3;i++){
                        for(int j=0;j<4;j++){
                            System.out.print(num[i][j]+" ");
                    }
                        System.out.println();
                        
            }

            //advanced for loop
            System.out.println("Using advanced for loop:");
            for(int n[]:num){
                for(int m:n){
                    System.out.print(m+" ");

                }
                System.out.println();
            }
        }
    }
