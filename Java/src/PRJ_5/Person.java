package PRJ_5;

import java.time.Year;

abstract public class Person {
    String name;
    int yearOfBirth;
    char gender;
    int age;

    public Person(String name, int yearOfBirth, char gender) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender=gender;
        this.age=calcAge(this.yearOfBirth);

    }
    int calcAge(int yearOfBirth){
        age= Year.now().getValue()-yearOfBirth;
        return age;
    }
    void print(){
        System.out.println(
                "Name: "+this.name+"\n"
                +"Gender: "+this.gender+"\n"+
                 "Age: "+this.age
        );
    }
}
