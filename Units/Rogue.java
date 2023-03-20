package Units;

public class Rogue extends BaseHero{

    protected int endurance;
    public Rogue(String name) {
        super(name,"Thief", 10, 11, 15);
        this.endurance = 15;
    }
    @Override
    public String getInfo() {
        return "Rogue";
    }
    public void step() {
        System.out.println("Разбойник ударил ножом!");
    }





}
