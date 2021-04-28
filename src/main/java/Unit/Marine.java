package Unit;

import Unit.Interface.BasicControl;
import Unit.Interface.Healable;
import Unit.Interface.Terran;

public class Marine extends GroundUnit implements Terran, BasicControl, Healable {

    final int MAXHP = 40;

    public Marine(String nickName, int x, int y) {
        super(nickName, x, y);
        this.unitName = "마린";
        this.currentHp = MAXHP;
        this.atkDamage = 5;
    }


    //스팀팩
}
