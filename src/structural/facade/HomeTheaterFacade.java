package structural.facade;

// Facade
class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SurroundingSound surroundSound;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SurroundingSound surroundSound, Lights lights) {
        this.dvd = dvd;
        this.projector = projector;
        this.surroundSound = surroundSound;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Getting ready to watch a movie...");
        lights.dim();
        projector.on();
        surroundSound.on();
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down...");
        dvd.off();
        surroundSound.off();
        projector.off();
        lights.on();
    }
}
