package Complex2;

import java.time.LocalDate;

class Book extends Item {
    private String author;
    private int pages;

    public Book(String id, String title, LocalDate publicationDate, String author, int pages) {
        super(id, title, publicationDate, 21); // Books: 21-day checkout
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() { return author; }
    public int getPages() { return pages; }
}
