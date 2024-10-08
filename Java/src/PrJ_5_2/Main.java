package PrJ_5_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Type1 type1=new Type1();
        Type2 type2=new Type2();
        Type3 type3=new Type3();

            List<ObjectBehavior> obj= Arrays.asList(type1,type2,type3);
        for (int i = 0; i <obj.size() ; i++) {
            obj.get(i).getType();
            System.out.println(obj.get(i).getType());
            obj.get(i).performAction();
            System.out.println("Attribute Value:"+obj.get(i).getAttribute());
            System.out.println("\n");
        }

       /* obj.stream().forEach(n->n.performAction());
        obj.stream().map(n->n.getAttribute()).forEach(System.out::println);
        obj.stream().map(n->n.getType()).forEach(System.out::println);
        */
        type1.getDetail1();
        type2.getDetail2();
        type3.getDetail3();



    }
 }
