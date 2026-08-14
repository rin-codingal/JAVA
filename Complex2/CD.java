package Complex2;

import java.time.LocalDate;

class CD extends Item {
    private String artist;
    private int tracks;

    public CD(String id, String title, LocalDate publicationDate, String artist, int tracks) {
        super(id, title, publicationDate, 14); // CDs: 14-day checkout
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() { return artist; }
    public int getTracks() { return tracks; }
}
