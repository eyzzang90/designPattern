package facadePattern;

public class Amplifier {

    public Turner turner;
    public DvdPlayer dvdPlayer;
    public CdPlayer cdPlayer;

    public void on(){
        System.out.println("Amp를 켠다.");
    }

    public void off(){
        System.out.println("Amp를 끈다.");
    }

    public void setTurner(Turner turner) {
        this.turner = turner;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public void setStreoSound(){

    }

    public void setSurroundSound(){

    }

    public void setVolume(int size){
        System.out.println("volume 을 " + size +"(으)로 변경");
    }
}
