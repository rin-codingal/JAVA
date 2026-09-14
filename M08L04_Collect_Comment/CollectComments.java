package M08L04_Collect_Comment;

import java.util.ArrayList;

public class CollectComments {

    /**
     * Collects comments containing an exclamation mark and formats them.
     * 
     * @param allReviews list of Review objects
     * @return list of formatted comment strings
     */
    public ArrayList<String> collectComments(ArrayList<Review> allReviews) {
        ArrayList<String> comments = new ArrayList<>();

        for (int i = 0; i < allReviews.size(); i++) {
            String comment = allReviews.get(i).getComment();

            if (comment.contains("!")) {
                String formattedComment = String.format("%d-%s", i, comment);

                if (!comment.endsWith("!") && !comment.endsWith(".")) {
                    formattedComment += ".";
                }

                comments.add(formattedComment);
            }
        }

        return comments;
    }
}