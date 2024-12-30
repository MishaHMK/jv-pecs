package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketVolume;

    public Excavator(String name, String color, double bucketVolume) {
        super(name, color);
        this.bucketVolume = bucketVolume;
    }

    public Excavator() {
        super();
    }

    @Override
    public void doWork() {
        System.out.println("Excavator " + super.getName()
                + " started to work");
    }

    public double getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }
}
