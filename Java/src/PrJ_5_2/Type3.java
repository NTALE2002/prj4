package PrJ_5_2;

public class Type3 implements ObjectBehavior{
    int attributeThree=300;
    String detail3="Bike";

    public String getDetail3() {
        return detail3;
    }
    @Override
    public void performAction() {
        System.out.println(detail3+" runs by kick Starting");
    }

    @Override
    public void haltActions() {
        System.out.println(detail3+" stops by hitting the brakes and the crunch");
    }

    @Override
    public int getAttribute() {
    return attributeThree;
    }

    @Override
    public String getType() {
        return getClass().getName();
    }
}
