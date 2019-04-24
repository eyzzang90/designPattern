package templateMethodPattern.motor;

public class LGMotor extends Motor{

    public LGMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("LG Motor를 구동시킨다.");
    }
}
