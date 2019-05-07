package facadePattern;

public class TheaterLights {

    public void on(){
        System.out.println("TheaterLights를 켠다.");
    }
    public void off(){
        System.out.println("TheaterLights를 끈다.");
    }

    public void dim(int degree){
        System.out.println("밝기를 "+degree+" 만큼 어둡게 한다.");
    }
}
