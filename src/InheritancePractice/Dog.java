package InheritancePractice;

public class Dog extends Animal{

    // unique characteristics that only a dog has, not other animals
    //fields are defined to later be constructed in the constructor
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // All animals have these characteristics so we use inheritance to extend from the base class
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
}
