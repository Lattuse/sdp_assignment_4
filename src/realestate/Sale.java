package realestate;

public class Sale implements AgencyOperation {
    @Override
    public void operate(Property property) {
        System.out.println(property.getType() + " at " + property.getAddress()
                + " is now FOR SALE at $" + property.getSalePrice());
    }
}


