package Complex2;

import java.time.LocalDate;

class DVD extends Item {
    private String director;
    private int runningTime;

    public DVD(String id, String title, LocalDate publicationDate, String director, int runningTime) {
        super(id, title, publicationDate, 7); // DVDs: 7-day checkout
        this.director = director;
        this.runningTime = runningTime;
    }

    public String getDirector() { return director; }
    public int getRunningTime() { return runningTime; }
}
