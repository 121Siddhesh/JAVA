class typeconversion
{
    public static void main(String a[]){
        
        int num=257;
        byte b= (byte)num ;//explicit type conversion
        System.out.println("Value of b: " + b); 
        

        int num1=13;
        byte b1= (byte)num1 ;//explicit type conversion
        System.out.println("Value of b1: " + b1);

        float f=10.89f;
        int i =(int)f; //explicit type conversion
        System.out.println("Value of i: " + i);


        byte b2=10;
        byte b3=30;
         int mul = b2 * b3; //Type promotion
            System.out.println("value after Multiplication: " + mul);

    }
} 