package Unit;

import Unit.Interface.BasicControl;
import Unit.Interface.Repairable;
import Unit.Interface.Terran;

public class BattleCruiser extends TerranAirUnit implements Terran, BasicControl, Repairable {


    public BattleCruiser(String nickName, String unitName, int maxHp, int currentHp, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, maxHp, currentHp, atkDamage, atkTarget, x, y);
    }


}

//    String[] hotKey = {"b", "B"};
//    String race = "Terran";
//    int hp = 500;
//    int armor = 3;
//    int atkDamage = 25;
//    String atkType = "general";
//    int atkRange = 6;
//    int atkSpeed = 30;
//    String[] atkTarget = {"ground", "air"};
//    float moveSpeed = 1.172f;
//    int vision = 11;
//    String activityArea = "air";
//    boolean bio = false;
//    boolean machinery = true;
//    String size = "large";
//
//    void move(){
//        System.out.println("이동한다.");
//    }
//
//    void stop(){
//        System.out.println("멈춘다.");
//    }
//
//    void attack(){
//        System.out.println("대상을 공격한다.");
//    }
