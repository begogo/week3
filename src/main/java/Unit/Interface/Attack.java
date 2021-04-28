package Unit.Interface;

import Unit.*;

public interface Attack {

    default void attack(Unit attacker, Unit target){

        if(target.checkAlive(target)){
            switch (attacker.getAtkTarget()){

                case "both":
                    attackPrompt(attacker, target);
                    target.checkAlive(target);
                    System.out.println();
                    break;

                case "ground":
                    if (target instanceof GroundUnit){
                        attackPrompt(attacker, target);
                        target.checkAlive(target);
                        System.out.println();
                        break;
                    }
                    System.out.println(attacker.getNickName()+"(지상공격만 가능) --> " + target.getNickName() + "(공중유닛) : 공격불가!" );
                    System.out.println();
                    break;

                case "air":
                    if (target instanceof AirUnit){
                        attackPrompt(attacker, target);
                        target.checkAlive(target);
                        System.out.println();
                        break;
                    }
                    System.out.println(attacker.getNickName()+"(공중공격만 가능) --> " + target.getNickName() + "(지상유닛) : 공격불가!" );
                    System.out.println();
                    break;

            }
        }

    }

    private void attackPrompt (Unit attacker, Unit target) {
        target.setCurrentHp(target.getCurrentHp() - attacker.getAtkDamage());
        System.out.println(attacker.getNickName()+" 공격 " + target.getNickName() + " : 데미지 " + attacker.getAtkDamage());
        System.out.println(target.getNickName() + " 현재HP: " + Math.max( 0, target.getCurrentHp() ));
    }

}
