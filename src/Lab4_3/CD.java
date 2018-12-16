package Lab4_3;

public class CD extends MusicPlayer {
    String nazwa = "odtwarzacz CD";

    public CD(Song[] library) {
        super(library);
    }

    @Override
    public void stop() {
        setStatus(0);
        System.out.println(nazwa + " zatrzymał się na: " + getCurrentSong());
    }

    @Override
    public void play() {
        setStatus(1);
        System.out.println(nazwa + " gra: " + getCurrentSong());
    }

    @Override
    public void pause() {
        setStatus(2);
        System.out.println(nazwa + " czeka na: " + getCurrentSong());
    }

}
