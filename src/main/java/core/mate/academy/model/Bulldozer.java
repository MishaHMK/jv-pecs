package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int liftingCapacity;

    public Bulldozer(String name, String color, int liftingCapacity) {
        super(name, color);
        this.liftingCapacity = liftingCapacity;
    }

    public Bulldozer() {
        super();
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer "
                + super.getName() + " started to work");
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }
}
