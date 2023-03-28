package Units;

import java.util.ArrayList;

public class Wizard extends BaseHero{

    protected int Mana;
    public Wizard(String name) {
        super(name,"Wizard", 30, 9, 17,12);
        this.Mana = 20;
    }
    @Override
    public String getInfo() {
        return "Wizard";
    }
    @Override
    public void step(ArrayList<BaseHero>team, ArrayList<BaseHero> ourteam) {
        System.out.println("Колдун применил огненный дождь!");
    }


}
