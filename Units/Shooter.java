package Units;

public class Shooter extends BaseHero{

    
    protected int arrows;
    public Shooter() {
        super("Apple", "Shooter", 10,12, 14);
        this.arrows = 20;
    }
    public int Attack() {
        int Attack = damage;
        this.arrows -= 1;
        if (arrows <= 0) return 0;
        else return damage;
    }



}
