package PracticeExerciseOne;

public class Magician extends Character implements MagicSpells {
    public Magician(String name, String race, String sex, int age, int strength, int health, int attack) {
        super(name, race, sex, age, strength, health, attack);
    }

    @Override
    public void castFireBlast() {
        System.out.println("Magician casts fire blast!");
    }

    @Override
    public void castWaterBlast() {
        System.out.println("Magician casts water blast!");
    }

    @Override
    public void castEarthBlast() {
        System.out.println("Magician casts earth blast!");
    }

    @Override
    public void castWindBlast() {
        System.out.println("Magician casts wind blast!");
    }
}
