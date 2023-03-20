package Units;

public class Monk extends BaseHero{

    protected int Mana;
    public Monk(String name) {
        super(name,"Monk", 13, 14, 12);
        this.Mana = 20;
    }
    @Override
    public String getInfo() {
        return "Monk";
    }
    @Override
    public void step() {
        System.out.println("Монах применил удар грома!");
    }



}
