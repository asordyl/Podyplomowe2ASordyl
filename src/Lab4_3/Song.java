package Lab4_3;

public class Song {
    //nazwa artysty, tytuł utworu, nazwa albumu
    private String artistName;
    private String titleName;
    private String albumName;
    private int year;

    public Song(String artistName, String titleName, String albumName, int year) {
        this.artistName = artistName;
        this.titleName = titleName;
        this.albumName = albumName;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artistName='" + artistName + '\'' +
                ", titleName='" + titleName + '\'' +
                ", albumName='" + albumName + '\'' +
                ", year=" + year +
                '}';
    }
}
