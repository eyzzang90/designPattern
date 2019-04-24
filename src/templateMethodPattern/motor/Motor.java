package templateMethodPattern.motor;

public abstract class Motor {

    protected  Door door;
    private MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus(){
        return motorStatus;
    }

    protected void setMotorStatus(MotorStatus motorStatus){
        this.motorStatus = motorStatus;
        System.out.println("motorStatus: " + motorStatus);
    }

    // template method
    public void move(Direction direction){

        MotorStatus motorStatus = getMotorStatus();
        // 이미 이동 중이면 아무 작업을 하지 않음
        if(motorStatus == MotorStatus.MOVING){
            return;
        }

        DoorStatus doorStatus = door.getDoorStatus();
        // 문이 열려 있으면우선 문을 닫음
        if(doorStatus == DoorStatus.OPENED){
            door.close();
        }

        //모터를 주어진 방향으로 이동시킴
        moveMotor(direction);

        setMotorStatus(MotorStatus.MOVING);

    }

    // primitive or hook method : move 메소드에서 호출되면서 하위 클래스에서 오버라이드 되는 메소드
    protected abstract void moveMotor(Direction direction);
}
