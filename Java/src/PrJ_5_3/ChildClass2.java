package PrJ_5_3;

public class ChildClass2 extends ParentClass{
    String course;
   int age;
    public ChildClass2(String firstName, String lastName,String course,int age ) {
        super(firstName, lastName);
        this.age=age;
        this.course=course;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Course: "+course );
        System.out.println("Age: "+age +"\n");
    }
}
