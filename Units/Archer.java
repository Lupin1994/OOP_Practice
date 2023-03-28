package Units;

import java.util.ArrayList;

public class Archer extends BaseHero{

    protected int arrows;

    public Archer(String name) {
        super(name, "Archer", 10, 4, 6,3);
        this.arrows = 16;
    }

    @Override
    public String getInfo() {
        return "Archer ";
    }

    @Override
    public void step(ArrayList<BaseHero>team, ArrayList<BaseHero> ourteam) {
        if(this.arrows > 0 && this.healthPoint > 0 ){
            System.out.println("Могу стрелять!");
            for(BaseHero baseHero : team){
                if(baseHero.healthPoint > 0){
                    this.attack(baseHero,this.damage);
                    this.arrows--;
                    break;
                }
            }
        }
        System.out.println(this.toString());
        for (BaseHero baseHero : ourteam) {
            if(baseHero.getInfo().equals("Peasent")){
                this.arrows++;
            }
        }
        System.out.println(this.toString());
        
    }
    @Override
    public String toString(){
        return "Осталось стрел: " + String.valueOf(arrows);
    }

    





}
