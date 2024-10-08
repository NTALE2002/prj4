package PRJ_5;

public class Main {
    public static void main(String[] args) {
    Accountant accountant1=new Accountant(
            "Nabagereka Diana",2003,'F',4
    );
    Accountant accountant2=new Accountant(
            "Jjagwe Martin",2004,'M',3);
    Accountant accountant3=new Accountant(
            "Namuli Tracy",2004,'F',6);

    Engineer engineer1=new Engineer("Aita Ryan",2003,'M',
            "Software Dev");
    Engineer engineer2=new Engineer(
            "Kasule Andrew",2001,'M',"Computer Scientist");


    //printing Object Details
        accountant1.print();
        System.out.println("\n");
        accountant2.print();
        System.out.println("\n");
        accountant3.print();
        System.out.println("\n");

    //Printing Engineers
    engineer1.print();
    System.out.println("\n");
    engineer2.print();


    }

}
