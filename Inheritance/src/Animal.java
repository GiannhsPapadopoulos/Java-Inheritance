

public class Animal {

    // Fields
    protected String type;
    private String size;
    private double weight;

    // Constructor

    public Animal() {

    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }


    // Methods
    public String toString() {
        return "Animal{" +
                "type='" + this.type + '\'' +
                ", size='" + this.size + '\'' +
                ", weight=" + this.weight + '}';
    }

    public void move(String speed) {
        System.out.println(this.type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(this.type + " makes some kind of noise");
    }
}