package Units;

import java.util.ArrayList;
import java.util.Random;


public abstract class BaseHero implements UnitInterface{

    protected Random rnd = new Random();
    protected  final String NAME;
    protected String Class;
    protected int healthPoint;
    protected int speed;
    protected static int damage;
    protected int protection;

    public void getName(){
        System.out.println(NAME);
    }


    public BaseHero(String name , String class1, int healthPoint, int speed, int damage,int protection) {
        NAME = name;
        Class = class1;
        this.healthPoint = healthPoint;
        this.speed = speed;
        this.damage = damage;
        this.protection = protection;
    }
    @Override
    public String getInfo() {
        return "";
    }

    @Override
    public void step(ArrayList<BaseHero>team, ArrayList<BaseHero> ourteam) {
        System.out.println("Шаг");
        
    }

    public int getSpeed(){
        return this.speed;
    }

    public void getDamage(int damage){
        if(this.healthPoint - damage > 0){
            this.healthPoint -= damage;
        }
        else
            this.healthPoint = 0;
    }

    public void attack(BaseHero target, int damage){
        int causedDamage = rnd.nextInt(1,damage);
        System.out.printf("%s attack %s\t",this.getClass().getName(), 
                                                  target.getClass().getName());
        System.out.printf("Power of knock = %d\n",causedDamage);
        System.out.printf("%s target hp=  %d  ",target.getClass().getName(),
                                                               target.healthPoint);
        //target.getDamge(causedDamage);
    }


    

    
}
