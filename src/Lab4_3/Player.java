package Lab4_3;

public interface Player {
    /*interfejs Player powienien dostarczać takich funkcji jak odtwarzaj, pauza stop, następny utwór, poprzedni utwór
    przetestuj działanie odwtwarzaczy (np. symulując działanie przez wyświetlenie odpowiednich komunikatów ‘Gra odtwarzacz MP3’)*/
    void play();
    void pause();
    void stop();
    void next();
    void prev();
}
