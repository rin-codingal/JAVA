import java.util.Scanner;

public class MovieRatingChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter day movie rating: ");

        int rating = scn.nextInt();

        if (rating > 75000) {
            System.out.println("Out of the world");
        } else if (rating > 45000 && rating < 70000) {
            System.out.println("Best");
        } else if (rating > 25000) {
            System.out.println("Better");
        } else if (rating > 5000) {
            System.out.println("Good");
        } else {
            System.out.println("Rating is too low or invalid");
        }
    }
}