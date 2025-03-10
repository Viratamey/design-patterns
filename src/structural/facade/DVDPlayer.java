package structural.facade;

class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is On");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void off() {
        System.out.println("DVD Player is Off");
    }
}