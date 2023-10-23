/**
 * Αυτή η κλάση αναπαριστά ένα ανθρώπινο σώμα.
 * This class represents a human body.
 */
public class Human {

    /*
    Ο κατασκευαστής θα δέχεται δύο παραμέτρους. Η πρώτη
    παράμετρος θα αφορά το βάρος και η δεύτερη το ύψος του ανθρώπου.

    The constructor should have 2 parameters. The first parameter
    should be the weight of the human and the second one its height.
    */

    private double weight, height;

    public Human(double weight, double height) {
        this.weight=weight;
        this.height=height;
        
    }

    /*
    * Μέθοδος που θα επιστρέφει τον Δείκτη Μάζας Σώματος (ΔΜΣ) του ανθρώπου
    * ΔΜΣ = βάρος / ύψος υψωμένο στο τετράγωνο
    * This method should return the Body Mass Index (BMI) of the human
    * BMI = weight / height squared
    * */

    public double getBMI() {
        return weight /( height*height);
    }

    /* Μέθοδος που αλλάζει το βάρος του ανθρώπου
     * This method should change the weight of the human */
    public void setWeight(double x) {
        weight=x;

    }

    /* Μέθοδος που αλλάζει το ύψος του ανθρώπου
     * This method should change the height of the human */
    public void setHeight(double x) {
        height=x;

    }

    /* Μέθοδος που επιστρέφει το ύψος του ανθρώπου
     * This method should return the weight of the human */
    public double getHeight() {
        return height;

    }

    /* Μέθοδος που επιστρέφει το βάρος του ανθρώπου
     * This method should return the weight of the human */
    public double getWeight() {
        return weight;
    }
}
