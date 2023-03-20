import java.util.ArrayList;
import java.util.Random;

import Units.*;
public class main {
    public static void main(String[] args) {

        // ArrayList<BaseHero> listStep = new ArrayList<>();
        // listStep.add(new Archer());
        // listStep.add(new Monk());
        // listStep.add(new Peasent());
        // listStep.add(new Rogue());
        // listStep.add(new Shooter());
        // listStep.add(new Spear());
        // listStep.add(new Wizard());

        // listStep.forEach(u->u.step());

        ArrayList<BaseHero> list = new ArrayList<>();
        ArrayList<BaseHero> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)){
                case 0:
                    list.add(new Archer(getName()));
                    break;
                case 1:
                    list.add(new Monk(getName()));
                    break;
                case 2:
                    list.add(new Peasent(getName()));
                    break;
                case 3:
                    list.add(new Rogue(getName()));
                    break;
                case 4:
                    list.add(new Shooter(getName()));
                    break;
                case 5:
                    list.add(new Monk(getName()));
                    break;
                case 6:
                    list.add(new Spear(getName()));
                    break;
                default:
                    list.add(new Wizard(getName()));
                    break;
            }
            switch (new Random().nextInt(7)){
                case 0:
                    list2.add(new Archer(getName()));
                    break;
                case 1:
                    list2.add(new Monk(getName()));
                    break;
                case 2:
                    list2.add(new Peasent(getName()));
                    break;
                case 3:
                    list2.add(new Rogue(getName()));
                    break;
                case 4:
                    list2.add(new Shooter(getName()));
                    break;
                case 5:
                    list2.add(new Monk(getName()));
                    break;
                case 6:
                    list2.add(new Spear(getName()));
                    break;
                default:
                    list2.add(new Wizard(getName()));
                    break;
            }

        }

        list.forEach(u -> u.getName());
        System.out.println("-----------------");
        list2.forEach(u -> u.getName());
    }
    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}
