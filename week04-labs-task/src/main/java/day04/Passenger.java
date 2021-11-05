package day04;

public class Passenger {

    private final String name;
    private final String ticketId;
    private final int amountOfPackages;

    public Passenger(String name, String ticketId, int amountOfPackages) {
        this.name = name;
        this.ticketId = ticketId;
        this.amountOfPackages = amountOfPackages;
    }

    public int getAmountOfPackages() {
        return amountOfPackages;
    }
}
