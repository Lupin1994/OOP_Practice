package Units;

public class Rogue extends BaseHero{

    protected int endurance;
    public Rogue() {
        super("Shade", "Thief", 10, 11, 15);
        this.endurance = 15;
    }
    public int Attack() {
        int Attack = damage;
        this.endurance -= 1;
        if (endurance <= 0) return 0;
        else return damage;
    }



}
