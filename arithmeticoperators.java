class ariops{
    public static void main(String args[]){
        int a=10;
        int b=20;
        int result =++a; //pre-increment
        System.out.println("Pre-increment a: " + result);
        int result1 =b++; //post-increment
        System.out.println("Post-increment b: " + result1);
        int c =10;
        int result2 =--c; //pre-decrement
        System.out.println("Pre-decrement c: " + result2);
        int d= 20;
        int result3 =d--; //post-decrement
        System.out.println("Post-decrement d: " + result3);
            
        System.out.println("addition  value of a+b: " + (a+b));
        System.out.println("subtraction value of b-a: " + (b-a));
        System.out.println("multiplication value of a*b: " + (a*b));
        System.out.println("division value of b/a: " + (b/a));
        System.out.println("modulus value of b%a: " + (b%a));

    }
}