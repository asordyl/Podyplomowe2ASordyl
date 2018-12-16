package Lab4_3;

public class PlayerApp {
    public static void main(String[] args) {
        Song[] library = new Song[3];
        library[0] = new Song("Michael Jackson","Beat It", "Thriller", 1992);
        library[1] = new Song("Scorpions","Wind of change", "Wind of change", 1990);
        library[2] = new Song("Roxette","It must have been love", "Joyride", 1994);

        MusicPlayer mp3 = new MP3(library);
        MusicPlayer cd = new CD(library);

        mp3.play();
        mp3.stop();
        mp3.next();

        System.out.println();

        cd.play();
        cd.stop();
        cd.prev();
        cd.prev();
        cd.pause();

    }
}
