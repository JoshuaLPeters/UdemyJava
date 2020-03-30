package PracticeExerciseOne;

public class DragonSprite extends Sprite implements DragonInterface, SpriteLootTable{
    public DragonSprite(String spriteName, int spriteHealth, int spriteDefense, int spriteStrength, int spriteAttack) {
        super(spriteName, spriteHealth, spriteDefense, spriteStrength, spriteAttack);
    }

    @Override
    public void Dragonfire() {
        System.out.println("Dragon uses Dragonfire!");
    }

    @Override
    public void Hover() {
        System.out.println("Dragon uses hover!");
    }

    @Override
    public void DropTable() {
        System.out.println("Dragon drops an item!");
    }
}
