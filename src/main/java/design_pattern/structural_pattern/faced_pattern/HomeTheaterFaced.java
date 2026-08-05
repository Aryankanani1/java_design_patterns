package design_pattern.structural_pattern.faced_pattern;

public class HomeTheaterFaced {
   private DVDPlayer dvdPlayer;
   private Amplifier amplifier;
   private Projector projector;

    public HomeTheaterFaced(DVDPlayer dvdPlayer, Amplifier amplifier, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
    }

    public void watchMovie(String movie){
        dvdPlayer.on();
        amplifier.on();
        amplifier.SetSurroundSound();
        projector.on();
        projector.setInput("DVD");
        dvdPlayer.play(movie);
    }


}
