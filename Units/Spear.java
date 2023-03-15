package Units;

public class Spear extends BaseHero{

    protected int endurance;
    public Spear() {
        super("Leon", "Spear", 15, 10, 12);
        this.endurance = 11;

    }
    public int Attack() {
        int Attack = damage;
        this.endurance -= 1;
        if (endurance <= 0) return 0;
        else return damage;
    }


}
