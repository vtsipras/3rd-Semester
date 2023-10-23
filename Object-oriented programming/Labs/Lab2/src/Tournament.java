/**
 * Αυτή η κλάση αναπαριστά ένα τουρνουά σκάκι που  αποτελείται από δύο παίκτες (Player κλάση).
 * This class represents a chess tournament consisting of two players (Player class).
 */
public class Tournament {

    public Player player1;
    public Player player2;

    // Δημιουργήστε έναν κατασκευαστή που να δέχεται ως όρισματα τους 2 παίκτες.
    // Create a constructor that has as parameters the 2 players.
    public Tournament(Player player1, Player player2) {

        this.player1 = player1;
        this.player2 = player2;
    }

    /**
     * Αυτή η μέθοδος επιστρέφει τπν πρώτο παίκτη του τουρνουά.
     * This method returns the first player of the tournament.
     */
    public Player getPlayer1() {
        return player1;

    }

    /**
     * Μέθοδος που αλλάζει τον πρώτο παίκτη του τουρνουά.
     * This method should change the 1st player of the tournament.
     */
    public void setPlayer1(Player player1) {
        this.player1 = player1;

    }

    /**
     * Αυτή η μέθοδος επιστρέφει τον δεύτερο παίκτη
     * This method returns the second player.
     */
    public Player getPlayer2() {
        return player2;

    }

    /**
     * Μέθοδος που αλλάζει τον δεύτερο παίκτη του τουρνουά.
     * This method should change the 2nd  player of the tournament.
     */
    public void setPlayer2(Player player2) {
        this.player2 = player2;

    }

    /**
     * Μέθοδος που επιστρέφει τον μέσο όρο των νικών των παικτών που συμμετέχουν στο τουρνουά.
     * This method returns the average number of wins for the players that participate in the tournament.
     */
    public double getAverageWins() {
        return (player1.getWins() + player2.getWins())/2.0;

    }

    /**
     * Μέθοδος που υπολογίζει το χρηματικό έπαθλο που θα πάρει ο νικητής (αυτός που έχει τις περισσότερες νίκες στο
     * τουρνουά). Το ποσό υπολογίζεται πολλαπλασιάζοντας τις νίκες με την τιμή της παραμέτρου της μεθόδου, δηλαδή
     * "νίκες * euroPerWin". Αν οι δύο παίκτες έχουν τις ίδιες νίκες, τότε μοιράζονται το χρηματικό έπαθλο,
     * δηλαδή "νίκες / 2"
     * <p>
     * This method calculates the prize (money) the winner will get (the one with the more wins in the tournament).
     * The amount of money is calculated by multiplying the number of wins with the given parameter (wins * euroPerWin).
     * If both players have the same number of wins, the prize is split between the two players (wins /2).
     */
    public double calculatePrize(double euroPerWin) {
        if (player1.getWins() > player2.getWins())
        {
            return player1.getWins() * euroPerWin;
        }
        else if (player1.getWins() < player2.getWins())
        {
            return player2.getWins() * euroPerWin;
        }
        else
        {
            return (player1.getWins() / 2.0) * euroPerWin;
        }

    }


}
