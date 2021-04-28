package Unit;

import Unit.Interface.BasicControl;
import Unit.Interface.Healable;
import Unit.Interface.Terran;

public class Marine extends GroundUnit implements Terran, BasicControl, Healable {


    public Marine(String nickName, String unitName, int MAXHP, int currentHp, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, MAXHP, currentHp,  atkDamage, atkTarget, x, y);
    }


    //스팀팩
}
