package Units;

public abstract class BaseHero implements UnitInterface{

    protected  final String NAME;
    protected String Class;
    protected int healthPoint;
    protected int speed;
    protected static int damage;

    public void getName(){
        System.out.println(NAME);
    }


    public BaseHero(String name , String class1, int healthPoint, int speed, int damage) {
        NAME = name;
        Class = class1;
        this.healthPoint = healthPoint;
        this.speed = speed;
        this.damage = damage;
    }
    @Override
    public String getInfo() {
        return "";
    }

    @Override
    public void step() {
        System.out.println("Шаг");
        
    }


    

    
}
