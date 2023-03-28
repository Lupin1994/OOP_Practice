package Units;

import java.util.ArrayList;

public class Spear extends BaseHero{

    protected int endurance;
    public Spear(String name) {
        super(name,"Spear", 10, 4, 4,5);
        this.endurance = 11;

    }
    @Override
    public String getInfo() {
        return "Spear";
    }
    public void step(ArrayList<BaseHero>team, ArrayList<BaseHero> ourteam) {
        System.out.println("Копейщик ударил копьем!");
    }





}
