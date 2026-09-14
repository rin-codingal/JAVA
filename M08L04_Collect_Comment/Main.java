package M08L04_Collect_Comment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CollectComments obj = new CollectComments();

        System.out.print("Enter the number of reviews: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        ArrayList<Review> allReviews = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter comment for review " + (i + 1) + ": ");
            String comment = sc.nextLine();
            allReviews.add(new Review(comment));
        }

        ArrayList<String> comments = obj.collectComments(allReviews);

        System.out.println("\n--- OUTPUT ---");
        System.out.println("Formatted comments:");
        for (String c : comments) {
            System.out.println(c);
        }

        sc.close();
    }
}