import java.util.Scanner;
class temp{
    public static void main(String arr[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Temperature Conversion");
        System.out.print("Enter Temperature in Fahrenheit:");
        double fahrenheit=input.nextDouble();
        double celsius=(fahrenheit-32)*5/9;
        System.out.println("Temperature in Celsius is:"+celsius);
        
    }
}