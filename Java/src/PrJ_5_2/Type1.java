package PrJ_5_2;

public class Type1 implements ObjectBehavior{
    int attributeOne=100;
    String detail1="Player";

    public String getDetail1() {
        return detail1;
    }

    @Override
    public void performAction() {
        System.out.println(detail1+ " plays football");
    }

    @Override
    public void haltActions() {
        System.out.println(detail1 + " retires from football");
    }

    @Override
    public int getAttribute() {
     return attributeOne;
    }

    @Override
    public String getType() {
        return getClass().getName();
    }
}
