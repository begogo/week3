package Unit;

import Unit.Interface.*;

public class Scv extends TerranGroundUnit implements Terran, BasicControl, Worker, Repairable, Healable {

    public Scv(String nickName, String unitName, int maxHp, int currentHp, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, maxHp, currentHp, atkDamage, atkTarget, x, y);
    }

    public void repair(Unit repairman, Unit target){
        if(target instanceof Repairable) {
            System.out.println(repairman.getNickName()+": "+ target.getUnitName()+" - 수리가능 --> 수리실시!");
        } else {
            System.out.println(repairman.getNickName()+": "+ target.getUnitName()+" - 수리불가 --> 잘못 지정했습니다");
        }
    }

}
