package Units;

public class Spear extends BaseHero{

    protected int endurance;
    public Spear(String name) {
        super(name,"Spear", 15, 10, 12);
        this.endurance = 11;

    }
    @Override
    public String getInfo() {
        return "Spear";
    }
    public void step() {
        System.out.println("Копейщик ударил копьем!");
    }





}
