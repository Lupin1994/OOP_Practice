package Units;

public class Archer extends BaseHero{

    protected static int arrows;

    public Archer(String name) {
        super(name, "Archer", 10, 12, 14);
        this.arrows = 20;
    }

    @Override
    public String getInfo() {
        return "Archer";
    }

    @Override
    public void step() {
        System.out.println("Лучник выстрелил!");
    }

    





}
