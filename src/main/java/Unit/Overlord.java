package Unit;

import Unit.Interface.*;

public class Overlord extends AirUnit implements Zerg, Move, Stop, Detectable {

    int increaseSupply = 8;

    public Overlord(String nickName, String unitName, int MAXHP, int currentHp, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, MAXHP, currentHp,  atkDamage, atkTarget, x, y);
    }



}
