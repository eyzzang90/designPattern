package facadePattern;

public class HomeTheaterTestDrive {




    public static void main(String[] args) {

        Amplifier amp = new Amplifier();
        Turner turner = new Turner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projecter projecter = new Projecter();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, turner, dvdPlayer, cdPlayer, projecter, lights, screen, popper);
        homeTheater.watchMovie("타짜");
        homeTheater.endMovie();

    }
}
