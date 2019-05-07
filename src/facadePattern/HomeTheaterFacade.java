package facadePattern;

public class HomeTheaterFacade {

    Amplifier amp;
    Turner turner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projecter projecter;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Turner turner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projecter projecter, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.turner = turner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projecter = projecter;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");

        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projecter.on();
        projecter.wideScreenMode();
        amp.on();
        amp.setDvdPlayer(dvdPlayer);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting movie theater down...");

        popper.off();
        lights.on();
        screen.up();
        projecter.off();
        amp.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();

    }
}
