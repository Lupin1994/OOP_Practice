package Units;

public class BaseHero {

    protected String Name;
    protected String Class;
    protected int healthPoint;
    protected int speed;
    protected int damage;

    public BaseHero(String name, String class1, int healthPoint, int speed, int damage) {
        Name = name;
        Class = class1;
        this.healthPoint = healthPoint;
        this.speed = speed;
        this.damage = damage;
    }

    

    
}
