/**
 * Κλάση που αναπαριστά έναν κύλινδρο. Η κλάση θα πρέπει να επεκτείνει την κλάση κύκλος.
 * <p>
 * Class that represents a cylinder. This class should extend the Circle class
 */
public class Cylinder extends Circle {
    double h,r;

    /**
     * Κατασκευαστής/ Constructor
     *
     * @param r ακτίνα του κυλίνδρου / the cylinder's radius
     * @param h ύψος του κυλίνδρου / the cylinder's height
     */
    public Cylinder(double r, double h) {
        super(r);
        this.h=h;
    }

    /**
     * Υπολογίζει τον όγκο του κυλίνδρου, ο οποίος ισούται με το εμβαδό μίας εκ των βάσεών του επί το ύψος του.
     * <p>
     * Computes the total volume of the cylinder which equals the total area of its base multiplied by its height.
     *
     * @return όγκος του κυλίνδρου / the volume of the cylinder
     */
    public double getVolume() {
       return super.getArea()*this.h;
    }

    /**
     * Επιστρέφει τo εμβαδό του κυλίνδρου, το οποίο ισούται με το άθροισμα του εμβαδού των δύο βάσεων και του εμβαδού
     * της παράπλευρης επιφάνειας, το οποίο ισούται με την περίμετρο της μίας βάσης επί το ύψος
     * <p>
     * Computer the total area of a cylinder, which equals the sum of the area of both bases and the lateral surface
     * area. The lateral surface area equals the perimeter of the base multiplied by the height.
     *
     * @return Το εμβαδό του κυλίνδρου / The total surface area of the cylinder
     */
    public double getArea() {
        return super.getArea()*2+super.getPerimeter()*this.h;
    }

}
