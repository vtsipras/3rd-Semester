import java.util.ArrayList;
import java.util.List;

/**
 * Κλάση που κρατάει μια λίστα από Circles
 * <p>
 * Class that holds a list with circles
 */
public class Controller {
    private ArrayList<Circle> circles=new ArrayList<>();

    /**
     * Κατασκευαστής
     * <p>
     * Constructor
     */
    public Controller() {

    }

    /**
     * Προσθήκη ενός κύκλου στην λίστα
     * <p>
     * Adds a circle to the list
     *
     * @param c Ο κύκλο που θα προστεθεί / The circle to add
     */
    public void addCircle(Circle c) {
        circles.add(c);

    }

    /**
     * Μέθοδος που επιλέγει μόνο τους κυλίνδρους από τη λίστα με τους κύκλους και τα επιστρέφει σε μια λίστα
     * <p>
     * Method that selects only the cylinders from the list with the circles and returns them in a list
     *
     * @return Η λίστα με τους κυλίνδρους / the list with the cylinders
     */
    public List<Cylinder> getCylinders() {
        List<Cylinder> cylinders = new ArrayList<>();
        for (Circle circle : circles) {
            if (circle instanceof Cylinder) {
                Cylinder cyl = (Cylinder) circle;
                cylinders.add(cyl);
            }
        }
        return cylinders;

    }

    /**
     * getter για την λίστα με τους κύκλους
     * <p>
     * getter for the list with the circles
     *
     * @return η λίστα με όλους τους κύκλους / the list with all the circles
     */
    public ArrayList<Circle> getCircles() {
        return circles;
    }
}
