package caffeinate_me;

import net.thucydides.core.annotations.Step;

public class Customer {

    private int distanceInMeters;

    String actor;

    @Step("Notify caffeinate me that customer is {0} meters from the shop")
    public void notifyDistanceFromShop(int distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }

    @Step("#actor places and order for {0}")
    public void placesOrderFor(String order) {

    }
}
