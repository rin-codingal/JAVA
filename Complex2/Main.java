package Complex2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create items
        Book book = new Book("B001", "1984", LocalDate.of(1949, 6, 8), "George Orwell", 328);

        DVD dvd = new DVD("D001", "Inception", LocalDate.of(2010, 7, 16), "Christopher Nolan", 148);

        CD cd = new CD("C001", "Thriller", LocalDate.of(1982, 11, 30), "Michael Jackson", 9);

        // Create patron Alice
        Patron alice = new Patron("Alice", 1234);
        alice.checkOutItem(book);
        alice.checkOutItem(dvd);
        System.out.println("Alice's checked-out items: " + alice.getNumItemsCheckedOut()); // 2

        // Return an item
        alice.returnItem(dvd);
        System.out.println("Alice's items after return: " + alice.getNumItemsCheckedOut()); // 1

        // Just to show CD exists
        alice.checkOutItem(cd);
        System.out.println("Alice's items after checking out a CD: " + alice.getNumItemsCheckedOut()); // 2
    }
}
