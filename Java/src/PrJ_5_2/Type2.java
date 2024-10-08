package PrJ_5_2;

public class Type2 implements ObjectBehavior {
    int attributetwo=200;
    String detail2="Vehicle";

    public String getDetail2() {
        return detail2;
    }
    @Override
    public void performAction() {
        System.out.println(detail2+ " runs by steping on the acceralation peddle ");
    }

    @Override
    public void haltActions() {
        System.out.println(detail2+ "Stops by hiiting the brakes");
    }

    @Override
    public int getAttribute() {
    return attributetwo;
    }

    @Override
    public String getType() {
        return getClass().getName();
    }
}
