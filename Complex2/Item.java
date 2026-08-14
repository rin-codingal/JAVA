package Complex2;

import java.time.LocalDate;

// Base abstract class
abstract class Item {
    private String id;
    private String title;
    private LocalDate publicationDate;
    private int maxCheckoutDays;

    public Item(String id, String title, LocalDate publicationDate, int maxCheckoutDays) {
        this.id = id;
        this.title = title;
        this.publicationDate = publicationDate;
        this.maxCheckoutDays = maxCheckoutDays;
    }

    // Getters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public LocalDate getPublicationDate() { return publicationDate; }
    public int getMaxCheckoutDays() { return maxCheckoutDays; }
}