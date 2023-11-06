import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Αυτή η κλάση αναπαριστά μια συλλογή μουσικών άλμπουμ ενός καλλιτέχνη για τον οποίον κρατάμε και το όνομα.
 * <p>
 * This class represents a collection of music albums of an artist, for whom we keep also the name..
 */
public class Artist {

    public List<Album> albums;
    private String name;
    /**
     * Δηλώστε όποιον / όποιους κατασκευαστές χρειάζονται
     * <p>
     * If needed, add one or more constructors
     */

    public Artist(String name){
        this.name=name;
        List<Album> albums = new ArrayList<>() ;
    }

    /**
     * Η μέθοδος αυτή προσθέτει ένα άλμπουμ στη συλλογή του καλλιτέχνη. Μπορούν να προστεθούν μέχρι 5 άλμπουμ.
     * <p>
     * This method adds an album to the artist's collection. Only five albums can be added.
     *
     * @param a To αλμπουμ / the album
     */
    public void addAlbum(Album a) {
        albums.add(a);
    }


    /**
     * Επιστρέφει τα άλμπουμ των οποίων ο τίτλος ξεκινάει με την τιμή της παραμέτρου titleStartsWith. Αν η τιμή της
     * παραμέτρου είναι null τότε επιστρέφονται όλα τα άλμπουμ.
     * <p>
     * Returns the albums whose titles start with the value of the parameter titleStartsWith. If the value of the
     * parameter is null, then all albums are returned.
     *
     * @param titleStartsWith Το string με το οποίο πρέπει να ξεκινάει ο τίτλος τους άλμπουμ / the string the album
     *                        title should start with
     * @return Τα άλμπουμ που ικανοποιούν την παράμετρο / the albums that satisfy the parameter
     */
    public HashSet<Album> getAlbums(String titleStartsWith) {
        HashSet<Album> albums1 = new HashSet<>();
        for (Album albums : albums){
            if (titleStartsWith == null || albums.getAlbumTitle().startsWith(titleStartsWith)){
                albums1.add(albums);
            }
        }
        return albums1;
    }


    /**
     * Η μέθοδος αυτή επιστρέφει τον αριθμό των τραγουδιών ενός καλλιτέχνη που έχουν διάρκεια μεγαλύτερη ή ίση με τον
     * δοθέντα αριθμό δευτερολέπτων.
     * <p>
     * This method computes the total number of songs that their duration equals or exceeds in seconds the given one.
     *
     * @param seconds Το κάτω όριο σε δευτερόλεπτα ενός τραγουδιού / the lower limit of a song's duration in seconds.
     * @return Το συνολικό αριθμό τραγουδιών που έχουν διάρκεια μεγαλύτερη ή ίση με τα μεταβλητή seconds / the total
     * number of songs that equals or exceeds the given duration.
     */
    public int durationGreater(int seconds) {
        int count = 0;
        for (Album album : albums) {
            for (String songTitle : album.getSongs()) {
                Integer songDuration = album.getDuration(songTitle);
                if (songDuration != null && songDuration >= seconds) {
                    count++;
                }
            }
        }
        return count;
    }
}
