package Units;

import java.util.ArrayList;

public class Rogue extends BaseHero{

    protected int endurance;
    public Rogue(String name) {
        super(name,"Thief", 10, 6, 8,3);
        this.endurance = 15;
    }
    @Override
    public String getInfo() {
        return "Rogue";
    }
    public void step(ArrayList<BaseHero>team, ArrayList<BaseHero> ourteam) {
        System.out.println("Разбойник ударил ножом!");
    }





}
