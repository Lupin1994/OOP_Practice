package Units;

public class Archer extends BaseHero{

    protected int arrows;

    public Archer() {
        super("Luck", "Archer", 10, 12, 14);
        this.arrows = 20;
    }

    public int Attack() {
        int Attack = damage;
        this.arrows -= 1;
        if (arrows <= 0) return 0;
        else return damage;
    }

}
