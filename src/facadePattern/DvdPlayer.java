package facadePattern;

public class DvdPlayer {

    public Amplifier amplifier;

    public void on(){
        System.out.println("DvdPlayer를 켠다.");
    }

    public void off(){
        System.out.println("DvdPlayer를 끈다.");
    }

    public void eject(){
        System.out.println("dvd를 뺀다.");
    }

    public void pause(){
        System.out.println("일시중지");
    }

    public void play(String movie){
        System.out.println(movie + "재생");
    }

    public void setSurroundAudio(){

    }

    public void setTwoChannelAudio(){

    }

    public void stop(){
        System.out.println("정지");
    }
}
