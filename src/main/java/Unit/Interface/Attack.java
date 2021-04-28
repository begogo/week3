package Unit.Interface;

import Unit.*;

public interface Attack {
    default void attack(Unit attacker, Unit target){

        target.currentHp -= attacker.atkDamage;
        System.out.println(attacker.nickName+"이(가) " + target.nickName + "을(를) 공격해 피해 " + attacker.atkDamage +"을(를) 입힘");
        System.out.println(target.nickName + "의 현재HP: " + target.currentHp);
    }
}
