class DVDPlayer {
    void on() {
        System.out.println("DVD turned on");
    }

    void play() {
        System.out.println("Playing movie");
    }
}

class Projector {
    void on() {
        System.out.println("Projector is on");
    }
}

class Speakers {
    void on() {
        System.out.println("Speakers are on");
    }
}

class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Speakers speakers;
    private Projector projector;

    HomeTheaterFacade() {
        this.dvdPlayer = new DVDPlayer();
        this.speakers = new Speakers();
        this.projector = new Projector();
    } 

    void watchMovie() {
        speakers.on();
        projector.on();
        dvdPlayer.on();
        dvdPlayer.play();
    }
}

class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie();
    }
}