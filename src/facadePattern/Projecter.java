package facadePattern;

public class Projecter {

    public DvdPlayer dvdPlayer;

    public void on(){
        System.out.println("Projecter를 켠다.");
    }

    public void off(){
        System.out.println("Projecter를 끈다.");
    }

    public void tvMode(){
        System.out.println("tv모드로 변경");
    }

    public void wideScreenMode(){
        System.out.println("wideScreen모드로 변경");
    }
}
