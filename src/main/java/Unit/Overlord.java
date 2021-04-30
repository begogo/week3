package Unit;

import Unit.Interface.*;

public class Overlord extends ZergAirUnit implements Zerg, Move, Stop, Detectable {

    int increaseSupply = 8;

    public Overlord(String nickName, String unitName, int maxHp, int currentHp, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, maxHp, currentHp,  atkDamage, atkTarget, x, y);
    }



}
