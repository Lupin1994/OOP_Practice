package Units;

import java.util.ArrayList;

public class Shooter extends BaseHero{

    
    protected int arrows;
    public Shooter(String name) {
        super(name,"Shooter", 15,9, 12,10);
        this.arrows = 32;
    }
    @Override
    public String getInfo() {
        return "Shooter";
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
