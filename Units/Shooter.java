package Units;

public class Shooter extends BaseHero{

    
    protected int arrows;
    public Shooter(String name) {
        super(name,"Shooter", 10,12, 14);
        this.arrows = 20;
    }
    @Override
    public String getInfo() {
        return "Shooter";
    }
    @Override
    public void step() {
        System.out.println("Снайпер выстрелил!");
    }





}
