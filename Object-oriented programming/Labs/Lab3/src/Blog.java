import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.RecursiveTask;

/**
 * Κλάση που αναπαριστά ένα blog το οποίο αποτελείται από αναρτήσεις (κλάση BlogPost). Σε ένα blog, εκτός από τις
 * αναρτήσεις, μας ενδιαφέρει και ο τίτλος του.
 * <p>
 * Class for the blog that contains posts (BlogPost class). Apart from the posts, we would also like to keep the title
 * of the blog..
 */
public class Blog {
    private ArrayList<BlogPost> blogPosts = new ArrayList<>();
    int i;
    private String title;
    private int characters;
    private int likes;
    private int views;
    public boolean hasImage;




    /**
     * Κατασκευαστής που αρχικοποιεί κατάλληλα τα πεδία της κλάσης
     * <p>
     * Constructor for initialising the class fields
     */
    public Blog(String title) {
        this.title = title;
        this.blogPosts = new ArrayList<>();
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
     * Μέθοδος που ενημερώνει τον τίτλο
     * <p>
     * Method for updating the title
     */
    public void setTitle(String title) {
        this.title=title;
    }

    /**
     * Μέθοδος που επιστρέφει τη λίστα με τις αναρτήσεις
     * <p>
     * Method foe returning the list with the posts
     */
    public List<BlogPost> getPosts() {
        return new ArrayList<BlogPost>();
    }


    /**
     * Μέθοδος που προσθέτει μια ανάρτηση στη λίστα με τις αναρτήσεις και επιστρέφει true. Η μέθοδος δεν προσθέτει την
     * ανάρτηση και επιστρέφει false αν έχει ανατεθεί αρνητικός αριθμός χαρακτήρων στο post (< 0), π.χ. από κάποιο
     * λάθος.
     * <p>
     * Method for adding a post to the blog, only if the value for characters is >=0. Otherwise, the post is not added
     * and the method returns false.
     */
    public boolean addPost(String title, int characters, int likes, int views, boolean hasImage) {
        if (characters >= 0){
            BlogPost post = new BlogPost(title, characters, likes, views, hasImage);
            blogPosts.add(post);
            return true;
        }
        else return false;
    }

    /**
     * Μέθοδος που επιστρέφει τον συνολικό αριθμό των likes των αναρτήσεων του blog. Η μέθοδος δέχεται ως παράμετρο το
     * αν θέλουμε τα likes να υπολογιστούν μόνο για τις αναρτήσεις που έχουν εικόνα ή όχι
     * <p>
     * Method for returning the total number of views of the blog posts. The method accepts as parameter a boolean value
     * according to whether or not we want the number of likes to be computed only for blog posts that have images.
     */
    public int getLikes(boolean onlyWithImages) {
        int totalLikes = 0;
        if (onlyWithImages) {
            for (BlogPost post : blogPosts) {
                if (post.hasImage()) {
                    totalLikes += post.getLikes();
                }
            }
        }
        else {
            for (BlogPost post : blogPosts) {
                    totalLikes += post.getLikes();
            }
        }
        return totalLikes;

        }

    /**
     * Μέθοδος που επιστρέφει τον μέσο αριθμό views που έχουν οι αναρτήσεις του blog
     * <p>
     * Method for returning the average number of views of the blog posts
     */
    public double getAveragePostViews() {
        int totalViews = getTotalViews();
        int numberOfPosts = blogPosts.size();

        if (numberOfPosts > 0) {
            return (double) totalViews / numberOfPosts;
        } else {
            return 0.0;
        }
    }

        public int getTotalViews() {
            int totalViews = 0;
            for (BlogPost post : blogPosts) {
                totalViews += post.getViews();
            }
            return totalViews;
        }


}
