package SE311LAB2.WEDNESDAY.PART2;

// Class MotherBoard implements a Part for sale.
// Pricing policy explicit here!
public class MotherBoard extends Part {
    public double getPrice() { // overrides parent's

        // return (1.45 * price);  //Premium
        return (0.90 * price);  //Labor Day Sale
    }
}
