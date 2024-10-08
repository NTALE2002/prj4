package PRJ_5;

public class Accountant extends Person{
    int yearsOfExperience;
    public Accountant(String name, int yearOfBirth, char gender,int yearsOfExperience) {
        super(name, yearOfBirth, gender);
        this.yearsOfExperience=yearsOfExperience;
    }

    @Override
    void print() {
        super.print();
        System.out.println("Experience: "+yearsOfExperience);
    }
}
