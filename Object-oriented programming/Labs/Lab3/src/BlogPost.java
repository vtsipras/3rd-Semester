import java.util.ArrayList;

/**
 * Αυτή η κλάση αναφέρεται σε μια ανάρτηση σε ένα blog. Τα χαρακτηριστικά που μας ενδιαφέρουν σε μια ανάρτηση είναι: O
 * τίτλος, ο αριθμός των χαρακτήρων που έχει, ο αριθμός των likes και των προβολών, καθώς και αν έχει ή όχι κάποια
 * εικόνα.
 * <p>
 * This class represents a blog post. For each post, we would like to have: the title, the number of characters of the
 * text, the number of likes and views, and if the post has an image or not..
 */

public class BlogPost {
    public ArrayList<BlogPost> blogPosts;
    private String title;
    private int characters;
    private int likes;
    private int views;
    public boolean hasImage;


    /**
     * Ο προκαθορισμένος κατασκευαστής.
     * <p>
     * This is the default constructor.
     */
    public BlogPost() {
        this.title="";
        this.likes=0;
        this.views=0;
        this.characters=0;
        this.hasImage=false;
    }

    /**
     * Κατασκευαστής που αρχικοποιεί τις παραμέτρους της κλάσης.
     * <p>
     * The constructor that initialises all the class fields.
     */
    public BlogPost(String title, int characters, int likes, int views, boolean hasImage) {
        this.title=title;
        this.characters=characters;
        this.likes=likes;
        this.views=views;
        this.hasImage=hasImage;
    }

    /**
     * Μέθοδος που επιστρέφει τον τίτλο
     * <p>
     * Method for returning the title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Μέθοδος που αλλάζει τον τίτλο
     * <p>
     * Method for updating the title
     */
    public void setTitle(String title) {
        this.title=title;
    }

    /**
     * Μέθοδος που επιστρέφει τους χαρακτήρες
     * <p>
     * Method for returning the characters
     */
    public int getCharacters() {
        return characters;
    }

    /**
     * Μέθοδος που ενημερώνει τους χαρακτήρες
     * <p>
     * Method for updating the characters
     */
    public void setCharacters(int characters) {
        this.characters=characters;
    }

    /**
     * Μέθοδος που επιστρέφει τα likes
     * <p>
     * Method for returning the likes
     */
    public int getLikes() {
        return likes;
    }

    /**
     * Μέθοδος που ενημερώνει τα likes
     * <p>
     * Method for updating the likes
     */
    public void setLikes(int likes) {
        this.likes=likes;
    }

    /**
     * Μέθοδος που επιστρέφει τις προβολές
     * <p>
     * Method for returning the views
     */
    public int getViews() {
        return views;
    }

    /**
     * Μέθοδος που ενημερώνει τις προβολές
     * <p>
     * Method for updating the views
     */
    public void setViews(int views) {
        this.views=views;
    }

    /**
     * Μέθοδος που επιστρέφει true ή false ανάλογα με το αν έχει το post εικόνα
     * <p>
     * Method for returning true or false according to whether the post has an image or not
     */
    public boolean hasImage() {
        return hasImage;
    }

    /**
     * Μέθοδος που ενημερώνει αν υπάρχει εικόνα ή όχι
     * <p>
     * Method for updating the hasImage field
     */
    public void setHasImage(boolean hasImage) {
        this.hasImage=hasImage;
    }

    /**
     * Μέθοδος που επιστρέφει το engagement rate της ανάρτησης. Το engagement rate υπολογίζεται ως ο λόγος των likes
     * προς τον αριθμό των προβολών
     * <p>
     * Method for returning the engagement rate of the post. It is calculated as the number of views divided by the
     * total views of the post
     */
    double getEngagementRate() {
        if (views >0)
        return (double) likes / (double) views;
        else
            return 0.0;
    }
}
