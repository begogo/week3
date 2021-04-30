package Unit.Interface;

import Unit.*;

public interface Protoss extends Race {
    public static final String RACE = "Protoss";

//    default String protossTell(Unit unit){
//
//        String unitType = (unit instanceof ProtossGroundUnit) ? "ProtossGroundUnit" : "ProtossAirUnit";
//
//        return "닉네임:" + unit.getNickName() + " / 종족: Protoss" + " / 유닛명:" + unit.getUnitName() + " / 최대HP:" + unit.getMaxHp()
//                + " / 현재HP:" + unit.getCurrentHp() + " / 최대실드:" + ((ProtossGroundUnit) unit).getMaxShield() + " / 현재실드:" + ((ProtossGroundUnit) unit).getCurrentShield()
//                + " / 공격력:" + unit.getAtkDamage() + " / 생존:" + unit.getIsAlive()
//                + " / Location(" + unit.getX() + ", " + unit.getY() + ")" ;
//    }

//    default String tellRace(){
//        return "Protoss";
//    }

}
