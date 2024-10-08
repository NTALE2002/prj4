package PrJ_5_3;

public class ChildClass1 extends ParentClass{
    String profession;
    public ChildClass1(String firstName, String lastName,String profession) {
        super(firstName, lastName);
        this.profession=profession;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Profession: "+this.profession+"\n");
    }
}
