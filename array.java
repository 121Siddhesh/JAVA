class arraydemo{
    public static void main(String arr[]){
        // Method 1: Declaration and Initialization
        int num[]=new int [4];
        num[0]=10;// Assignment
        num[1]=20;
        num[2]=30;
        num[3]=40;
        System.out.println("First array:");
        for (int i=0;i<=3;i++){
            System.out.println(num[i]);
        }
        // Method 2: Declaration, Initialization and Assignment
        System.out.println("Second array:");
        int num1[]={50,60,70,80,90};
        for(int i=0;i<=4;i++){
            System.out.println(num1[i]);
        }
    }
}