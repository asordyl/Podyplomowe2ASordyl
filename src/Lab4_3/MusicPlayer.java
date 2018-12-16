package Lab4_3;


abstract public class MusicPlayer implements Player {

    String nazwa;
    private int current;
    private int status; //0 - stop, 1 - play, 2 - pause

    private Song[] library;

    public MusicPlayer(Song[] library) {
        this.current = 0;
        this.library = library;
        this.status = 0;
    }

    public Song getCurrentSong(){
        return library[current];
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public void next() {
        if (++current >= library.length){
            current = 0;
        }
        if (getStatus() == 0)
        {
            play();
        }
    }

    @Override
    public void prev() {
        if (--current < 0){
            current = library.length-1;
        }
        if (getStatus() == 0)
        {
            play();
        }
    }
}
