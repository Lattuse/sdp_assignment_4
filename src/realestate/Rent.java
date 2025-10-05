package realestate;

public class Rent implements AgencyOperation {
    @Override
    public void operate(Property property) {
        System.out.println(property.getType() + " at " + property.getAddress()
                + " is now FOR RENT for $" + property.getRentPrice() + " per month");
    }
}


