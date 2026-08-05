package design_pattern.structural_pattern.faced_pattern;

public class Client {

    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();


        HomeTheaterFaced homeTheaterFaced = new HomeTheaterFaced(dvdPlayer,
                amplifier,
                projector
        );
        homeTheaterFaced.watchMovie("Interstellar");
    }
}
