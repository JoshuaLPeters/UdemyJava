//package InheritancePractice;
//
//public class Dog extends Animal{
//
//    // unique characteristics that only a dog has, not other animals
//    //fields are defined to later be constructed in the constructor
//    private int eyes;
//    private int legs;
//    private int tail;
//    private int teeth;
//    private String coat;
//
//    // All animals have these characteristics so we use inheritance to extend from the base class
//    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
//        super(name, 1, 1, size, weight);
//        this.eyes = eyes;
//        this.legs = legs;
//        this.tail = tail;
//        this.teeth = teeth;
//        this.coat = coat;
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Dog.eat() called");
//        super.eat();
//    }
//
//    private void chew(){
//        System.out.println("Dog.chew() called");
//        chew();
//        super.eat();
//    }
//
//
//    private void moveLegs(int speed){
//        System.out.println("Dog.moveLegs() called");
//    }
//
//    @Override
//    public void move(int speed) {
//        System.out.println("Dog.move() called");
//        super.move(speed);
//    }
//
//    public void walk(){
//        System.out.println("dog.walk() called");
//        super.move(5);
//    }
//    public void run(){
//        System.out.println("dog.run() called");
//        move(10);
//    }
//}
