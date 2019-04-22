package strategyPattern.robot;

public abstract class Robot {

    private String name;
    Attack attack;
    Moving moving;

    public Robot(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void move();

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public void setMoving(Moving moving) {
        this.moving = moving;
    }
}
