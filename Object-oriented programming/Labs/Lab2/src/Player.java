/**
 * Αυτή η κλάση αναπαριστά έναν παίκτη.
 * This class represents a player.
 */
public class Player {

        private int id;
        private int wins;

    // Δημιουργήστε έναν κατασκευαστή που θα δέχεται ως όρισμα το ID. Οι νίκες ενός νέου παίκτη είναι 0.
    // Create a constructor with one parameter, the player's ID. A new player should have 0 wins.

        public Player(int id) {
            this.id = id;
            this.wins = 0;
        }
    /**
     * Μέθοδος που επιστρέφει το id του παίκτη.
     * This method return the id of the player.
     */
    public int getId() {
        return id;

    }

    /**
     * Μέθοδος που αλλάζει το id του παίκτη.
     * This method updates the id of the player.
     */

    public void setId(int id) {
        this.id = id;

    }

    /**
     * Μέθοδος που επιστρέφει τον αριθμό των νικών του παίκτη.
     * This method returns the number of wins of the player.
     */
    public int getWins() {
        return wins;

    }

    /**
     * Μέθοδος που αλλάζει τον αριθμό των νικών ενός παίκτη.
     * This method updates the number of wins of the player.
     */
    public void setWins(int wins) {
        this.wins = wins;

    }

    /**
     * Μέθοδος που επιστρέφει true/false ανάλογα με το αν ο παίκτης πρέπει να πάρει ή όχι τα άσπρα πιόνια.
     * Αν ο παίκτης έχει περισσότερες νίκες από τις νίκες ενός αντιπάλου (που δίνεται ως παράμετρος στη συνάρτηση),
     * τότε παίρνει τα άσπρα, αλλιώς παίρνει τα μαύρα. Αν έχουν τις ίδιες νίκες, τα άσπρα τα παίρνει αυτός με το
     * μεγαλύτερο id.
     * <p>
     * This method returns true of false, according to weather this player should take the white or black pawns.
     * If this player has more wins than his/her opponent, then he/she takes the white pawns. If he/she has less wins,
     * he/she takes the black pawns. If the two players have the same number of wins, then the white pawns are given
     * to the player with the larger id.
     */
    public boolean shouldGetWhitePawn(Player otherPlayer) {
        if (wins > otherPlayer.wins) {
            return true;
        }
        else if (wins == otherPlayer.wins)
        {
            if (id > otherPlayer.id)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    /**
     * Αυτή η μέθοδος επιστρέφει έναν αριθμό που χαρακτηρίζει την εμπειρία (επίπεδο) του παίκτη, ανάλογα με τον αριθμό των νικών:
     * 1-> novice (<=5 νίκες), 2->advance (>=6 και <=19), 3-> expert (>=20).
     *
     * This method returns an number that corresponds to the level of expertise of the player, based on his/her wins:
     * 1-> novice (<=5 wins), 2->advance (>=6 και <=19), 3-> expert (>=20).
     */

    public int getLevel() {
        if (wins <= 5)
        {
            return 1;
        }
        else if (wins <= 19)
        {
            return 2;
        }
        else
            return 3;
     }
}
