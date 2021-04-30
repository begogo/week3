package Unit;

import Unit.Interface.BasicControl;
import Unit.Interface.Healable;
import Unit.Interface.Terran;

public class Marine extends TerranGroundUnit implements Terran, BasicControl, Healable {


    public Marine(String nickName, String unitName, int maxHp, int currentHp, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, maxHp, currentHp,  atkDamage, atkTarget, x, y);
    }


    //스팀팩
}
