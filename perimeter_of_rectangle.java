import java.util.Scanner;
class perimeter_of_rectangle{
    public static void main(String arr[])
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Calculate Perimeter of Rectangle");
        System.out.print("Enter Length:");
        int length=input.nextInt();
        System.out.print("Enter Breadth:");
        int breadth=input.nextInt();
        int perimeter=2*(length+breadth);
        System.out.println("Perimeter of Rectangle is:"+perimeter);


        System.out.print("Calculate Area of Triangle");
        System.out.print("Enter Base:");
        int base=input.nextInt();
        System.out.print("Enter Height:");
        int height=input.nextInt();
        int area=(base*height)/2;
        System.out.println("Area of Triangle is:"+area);


    
    }
}