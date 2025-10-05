package realestate;


public class Apartment extends Property {

    public Apartment(String address, double salePrice, double rentPrice, String owner,
                     AgencyOperation operation1, AgencyOperation operation2) {
        super(address, salePrice, rentPrice, owner, operation1, operation2);
    }

    @Override
    public void manage() {
        System.out.println("Managing Apartment owned by " + owner + ":");
        operation1.operate(this);
        operation2.operate(this);
    }

    @Override
    public String getType() {
        return "Apartment";
    }
}
