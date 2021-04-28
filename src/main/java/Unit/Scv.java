package Unit;

import Unit.Interface.*;

public class Scv extends GroundUnit implements Terran, BasicControl, Worker, Repairable, Healable {

    final int MAXHP = 60;

    public Scv(String nickName, int x, int y) {
        super(nickName, x, y);
        this.unitName = "SCV";
        this.currentHp = MAXHP;
        this.atkDamage = 5;
    }

    public void repair(Unit unit){
        if(unit instanceof Repairable) {
            System.out.println(unit.unitName+" 수리가능 --> 수리실시!");
        } else {
            System.out.println(unit.unitName+" 수리불가 --> 잘못 지정했습니다");
        }
    }


}
