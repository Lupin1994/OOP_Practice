package Units;

public class Peasent extends BaseHero{

    protected int endurance;
    public Peasent(String name) {
        super(name,"Peasent", 8, 7, 10);
        this.endurance = 10;
    }
    @Override
    public String getInfo() {
        return "Peasent";
    }
    @Override
    public void step() {
        System.out.println("Крестьянин ткнул вилами!");
    }




}
