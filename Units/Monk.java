package Units;

public class Monk extends BaseHero{

    protected int Mana;
    public Monk() {
        super("MasterShao", "Monk", 13, 14, 12);
        this.Mana = 20;
    }

    public int Attack() {
        int Attack = damage;
        this.Mana -= 2;
        if (Mana <= 0) return 0;
        else return damage;
    }

}
