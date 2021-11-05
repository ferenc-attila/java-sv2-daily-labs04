package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private final int maxCapacity;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassenger (Passenger passenger) {
        if (passengers.size() >= maxCapacity) {
            return false;
        } else {
            passengers.add(passenger);
            return true;
        }
    }

    public int numberOfPackages() {
        int numberOfPackages = 0;
        for (Passenger passenger : passengers) {
            numberOfPackages += passenger.getAmountOfPackages();
        }
        return numberOfPackages;
    }

    public static void main(String[] args) {

        Passenger johndoe = new Passenger("John Doe", "wjdsgf01", 3);
        Passenger jackdoe = new Passenger("Jack Doe", "wjdsgf02", 4);
        Passenger janedoe = new Passenger("Jane Doe", "wjdsgf03", 3);
        Passenger jilldoe = new Passenger("Jill Doe", "wjdsgf04", 6);
        Passenger joedoe = new Passenger("Joe Doe", "wjdsgf05", 2);

        Plane plane = new Plane(4);

        boolean isAdded;

        System.out.println(isAdded = plane.addPassenger(johndoe));
        System.out.println(isAdded = plane.addPassenger(jackdoe));
        System.out.println(isAdded = plane.addPassenger(janedoe));
        System.out.println(isAdded = plane.addPassenger(jilldoe));
        System.out.println(isAdded = plane.addPassenger(joedoe));

        System.out.println(plane.numberOfPackages());
    }

}
