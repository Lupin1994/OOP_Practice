package Units;

public class Wizard extends BaseHero{

    protected int Mana;
    public Wizard() {
        super("Baradun", "Wizard", 9, 11, 15);
        this.Mana = 20;
    }
    public int Attack() {
        int Attack = damage;
        this.Mana -= 2;
        if (Mana <= 0) return 0;
        else return damage;
    }
}
