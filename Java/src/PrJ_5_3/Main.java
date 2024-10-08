package PrJ_5_3;

public class Main extends TypeChecker {
    public static void main(String[] args) {
        ChildClass1 childClass1=new ChildClass1("Ntale","swamd","FullStack Dev");
        ChildClass2 childClass2=new ChildClass2("Hellena ","Tracy","BBA",19);

        childClass1.showDetails();
        childClass2.showDetails();

        identifyObjectType(childClass2);
        identifyObjectType(childClass1);


    }
}
