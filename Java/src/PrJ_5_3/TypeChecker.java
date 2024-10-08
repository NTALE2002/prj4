package PrJ_5_3;

public class TypeChecker {

    public static void  identifyObjectType(ParentClass obj){
        if(obj instanceof ChildClass1){
            System.out.println(obj.getClass().getName());
        } else if(obj instanceof ChildClass2){
            System.out.println(obj.getClass().getName());
        }
        else {
            System.out.println("DoesNot belong to any instance");
        }
    }
}
