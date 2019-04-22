package strategyPattern.robot;

public class RobotSimulator {

    public static void main(String[] args) {

        Robot atom = new Atom("Atom");
        //atom.setAttack(new Punch());
        atom.attack();

        atom.setAttack(new Punch());
        atom.attack();
        atom.move();

        atom.setMoving(new Walking());
        atom.move();

    }
}
