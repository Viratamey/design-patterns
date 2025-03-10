package structural.facade;

// Client code
public class Client {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SurroundingSound surroundSound = new SurroundingSound();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, surroundSound, lights);

        // Use facade to watch a movie
        homeTheater.watchMovie("The Matrix");
        homeTheater.endMovie();
    }
}
