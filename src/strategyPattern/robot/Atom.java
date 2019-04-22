package strategyPattern.robot;

public class Atom extends Robot{


    public Atom(String name) {
        super(name);
        //atom의 기본 공격, 움직임
        attack = new Missile();
        moving = new Flying();
    }

    @Override
    public void attack() {
        attack.attack();
        System.out.println("발에서 공격이 나온다");
    }

    @Override
    public void move() {
        moving.move();
        System.out.println("쾅코아쾅쾅");
    }
}
