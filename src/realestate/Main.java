package realestate;

public class Main {
    public static void main(String[] args) {
        Property house = new House(
                "123 Groove Street",
                250000, 1500,
                "Biba",
                new Sale(),
                new Rent()
        );

        Property apartment = new Apartment(
                "45 Smirnovo Avenue, Apt 12B",
                100000, 800,
                "Boba",
                new Rent(),
                new Sale()
        );

        house.manage();
        System.out.println();
        apartment.manage();
    }
}

