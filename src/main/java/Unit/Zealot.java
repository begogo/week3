package Unit;

import Unit.Interface.*;

public class Zealot extends ProtossGroundUnit implements Protoss, BasicControl, Healable {

    public Zealot(String nickName, String unitName, int maxHp, int currentHp, int maxShield, int currentShield, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, maxHp, currentHp, maxShield, currentShield, atkDamage, atkTarget, x, y);
    }



}
