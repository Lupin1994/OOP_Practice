package Units;

import java.util.ArrayList;

public interface UnitInterface {
    void step(ArrayList<BaseHero>team, ArrayList<BaseHero> ourteam);

    String getInfo();

}
