class student{
    int id;
    String name;
    double marks;

}
class arrofobj{
    public static void main(String arr[]){

        student s1=new student();
        s1.id=1;
        s1.name="Siddhesh";
        s1.marks=85.5;


        student s2=new student();
        s2.id=1;
        s2.name="Harsh";
        s2.marks=75.5;

        student s3=new student();
        s3.id=1;
        s3.name="Archit";
        s3.marks=95.5;

        student student1[]=new student[3];
        student1[0]=s1;
        student1[1]=s2; 
        student1[2]=s3;
        for(student s:student1){
            System.out.print("Student ID: "+s.id +",Name: "+s.name+",Marks: "+s.marks);
            System.out.println();
        }
        
    }
}