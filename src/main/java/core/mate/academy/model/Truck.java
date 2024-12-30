package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxCapacitySpeed;

    public Truck(String name, String color, int maxCapacitySpeed) {
        super(name, color);
        this.maxCapacitySpeed = maxCapacitySpeed;
    }

    public Truck() {
        super();
    }

    @Override
    public void doWork() {
        System.out.println("Truck " + super.getName()
                + " started to work");
    }

    public int getMaxCapacitySpeed() {
        return maxCapacitySpeed;
    }

    public void setMaxCapacitySpeed(int maxCapacitySpeed) {
        this.maxCapacitySpeed = maxCapacitySpeed;
    }
}
