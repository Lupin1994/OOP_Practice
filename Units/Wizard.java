package Units;

public class Wizard extends BaseHero{

    protected int Mana;
    public Wizard(String name) {
        super(name,"Wizard", 9, 11, 15);
        this.Mana = 20;
    }
    @Override
    public String getInfo() {
        return "Wizard";
    }
    @Override
    public void step() {
        System.out.println("Колдун применил огненный дождь!");
    }

}
