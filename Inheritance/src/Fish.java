

public class Fish extends Animal {

    // Fields
    private int fins;
    private int gills;

    // Constructor
    public Fish(String type, double weight, int fins, int gills) {

        super(type, weight < 2 ? "small" : (weight < 8 ? "medium" : "large"), weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles() {
        System.out.print("muscles moving ");
    }

    private void moveBackFin() {
        System.out.print("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}