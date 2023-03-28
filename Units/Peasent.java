package Units;

import java.util.ArrayList;

public class Peasent extends BaseHero{

    protected int endurance;
    public Peasent(String name) {
        super(name,"Peasent", 1, 3, 1,1);
        this.endurance = 10;
    }
    @Override
    public String getInfo() {
        return "Peasent";
    }
    @Override
    public void step(ArrayList<BaseHero>team, ArrayList<BaseHero> ourteam) {
        System.out.println("Крестьянин ткнул вилами!");
    }




}
