package realestate;

public abstract class Property {
    protected String address;
    protected double salePrice;
    protected double rentPrice;
    protected String owner;
    protected AgencyOperation operation1;
    protected AgencyOperation operation2;

    protected Property(String address, double salePrice, double rentPrice, String owner,
                       AgencyOperation operation1, AgencyOperation operation2) {
        this.address = address;
        this.salePrice = salePrice;
        this.rentPrice = rentPrice;
        this.owner = owner;
        this.operation1 = operation1;
        this.operation2 = operation2;
    }

    public abstract void manage();
    public abstract String getType();

    public String getAddress() {
        return address;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public String getOwner() {
        return owner;
    }
}

