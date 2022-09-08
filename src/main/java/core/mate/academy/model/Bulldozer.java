package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int scoopSize;

    public Bulldozer (String name, String color, int scoopSize) {
        super(color, name);
        this.scoopSize = scoopSize;
    }

    public Bulldozer() {
        super();
    }

    public int getScoopSize() {
        return scoopSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
