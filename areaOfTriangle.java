import java.util.Scanner;
class areaOfTriangle {
    public static void main(String arr[])
    {
       
        Scanner input =new Scanner(System.in);
        System.out.print("Calculate Area of Triangle");
        System.out.print("Enter Base:");
        int base=input.nextInt();
        System.out.print("Enter Height:");
        int height=input.nextInt();
        int area=(base*height)/2;
        System.out.println("Area of Triangle is:"+area);


    
    }
}