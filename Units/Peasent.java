package Units;

public class Peasent extends BaseHero{

    protected int endurance;
    public Peasent() {
        super("Barry", "Peasent", 8, 7, 10);
        this.endurance = 10;
    }
    public int Attack() {
        int Attack = damage;
        this.endurance -= 1;
        if (endurance <= 0) return 0;
        else return damage;
    }



}
