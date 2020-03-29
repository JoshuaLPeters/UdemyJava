package PracticeExerciseOne;

public class Character {
    private String name;
    private String race;
    private String sex;
    private int age;
    private int strength;
    private int health;
    private int attack;
    private int ranged;
    private int magic;


    public Character(String name, String race, String sex, int age, int strength, int health, int attack) {
        this.name = name;
        this.race = race;
        this.sex = sex;
        this.age = age;
        this.strength = strength;
        this.health = health;
        this.attack = attack;
    }

    public int CharacterMeleeDamage(){
        return 1 + (this.strength / 4);
    }
}
