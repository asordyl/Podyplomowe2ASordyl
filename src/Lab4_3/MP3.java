package Lab4_3;

public class MP3 extends MusicPlayer {

    public MP3(Song[] library) {
        super(library);
    }

    String nazwa = "Odtwarzacz MP3";


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
