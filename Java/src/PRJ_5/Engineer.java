package PRJ_5;

public class Engineer extends Person {
    String fieildOfStudy;
    public Engineer(String name, int yearOfBirth, char gender,String fieildOfStudy) {
        super(name, yearOfBirth, gender);
        this.fieildOfStudy=fieildOfStudy;
    }

    @Override
    void print() {
        super.print();
        System.out.println("FieldofStudy: "+fieildOfStudy);
    }

}
