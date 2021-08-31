package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }
}
