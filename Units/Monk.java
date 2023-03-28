package Units;

import java.util.ArrayList;

public class Monk extends BaseHero{

    protected int Mana;
    public Monk(String name) {
        super(name,"Monk", 30, 5, 12,7);
        this.Mana = 20;
    }
    @Override
    public String getInfo() {
        return "Monk";
    }
    @Override
    public void step(ArrayList<BaseHero>team, ArrayList<BaseHero> ourteam) {
        System.out.println("Монах применил удар грома!");
    }



}
