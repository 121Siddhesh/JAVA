class logops{
    public static void main(String arr[]){
        int a=10;
        int b=20;

        int c=30;
        int d=40;

        System.out.println("if a>b and c>d: "+((a>b)&&(c>d)));
        System.out.println("if a>b or c>b: "+((a>b)||(c>b)));
        System.out.println("if d>c and c>b and b>a: "+((d>c)&&(c>b)&&(b>a)));

    }
}