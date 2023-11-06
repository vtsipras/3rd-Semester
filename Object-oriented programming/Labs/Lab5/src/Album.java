import java.util.HashMap;


/**
 * Η κλάση αυτή αναπαριστά ένα μουσικό άλμπουμ, για το οποίο μας ενδιαφέρουν ο τίτλος του και ζευγάρια <τίτλος
 * τραγουδιού, διάρκεια>
 * <p>
 * This class represents an album for which we want to keep its title and pairs of type <song title, duration>
 *
 * @author Athanasios Lagopoulos
 */

public class Album{

    /**
     * Δηλώστε όποιον / όποιους κατασκευαστές χρειάζονται
     * <p>
     * If needed, add one or more constructors
     */
    private String albumTitle;
    private HashMap<String, Integer> song;

    public Album(String albumTitle) {
        this.albumTitle=albumTitle;
        HashMap<String, Integer> song = new HashMap<>();
    }


    /**
     * Getter
     * @return
     */
    public String getAlbumTitle() {
        return albumTitle;
    }

    /**
     * Η μέθοδος αυτή προσθέτει ένα τραγούδι στο άλμπουμ (μαζί με τη διάρκεια), μόνο αν δεν υπάρχει άλλο τραγούδι με
     * ίδιο τίτλο. Επιστρέφεται το άλμπουμ, είτε είναι επιτυχής είτε όχι η προσθήκη
     * <p>
     * This method adds a song to the album, only if there is no other song with the same title.
     *
     * @param title    Ο τίτλος του τραγουδιού / the title of the song
     * @param duration Η διάρκεια του τραγουδιού σε δευτερόλεπτα / the duration of the song in seconds
     * @return Το άλμπουμ / the album
     */
    public Album addSong(String title, int duration) {
        if (!song.containsKey(title)){
            song.put(title,duration);
        }
        return this;

    }

    /**
     * Επιστρέφει την διάρκεια ενός τραγουδιού δοθέντος του τίτλου. Αν το τραγούδι δεν υπάρχει επιστρέφει null.
     * <p>
     * Returns the duration of the song given its title, if the song doesn't exist it returns null.
     *
     * @param title ο τίτλος του τραγουδιού / the title of the song.
     * @return Την διάρκεια του τραγουδιού ή null / the duration of the song or null.
     */
    public Integer getDuration(String title) {
        if(song.containsKey(title)){
            return song.get(title);
        }
        else
            return null;

    }

    /**
     * Η μέθοδος αυτή επιστρέφει έναν πίνακα με όλους τους τίτλους των τραγουδιών.
     * <p>
     * This method returns a table with all the songs' title.
     *
     * @return Έναν πίνακα με τους τίτλους των τραγουδιών / a table with the songs' title.
     */
    public String[] getSongs() {
        return song.keySet().toArray(new String[0]);
    }

    /**
     * Επιστρέφει τη συνολική διάρκεια του άλμπουμ
     * <p>
     * Returns the total duration of the album
     *
     * @return Η διάρκεια / the duration
     */
    public int getTotalDuration() {
        int sum=0;
        int dur;
        for (String name : song.keySet()) {
            dur = song.get(name);
            sum+=dur;
        }
        return sum;
    }

}
