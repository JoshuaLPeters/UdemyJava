package InheritancePractice;

public class Cat extends Animal {

    private int meowLevel;
    private int whiskers;
    private String favoriteBox;

    public Cat(String name, int size, int weight, int meowLevel, int whiskers, String favoriteBox) {
        super(name, 1, 1, size, weight);
        this.meowLevel = meowLevel;
        this.whiskers = whiskers;
        this.favoriteBox = favoriteBox;
    }

    @Override
    public void move(int speed) {
        super.move(speed);
    }

    public void jump(int power){
        super.move(power);
    }
}
