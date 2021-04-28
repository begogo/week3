package Unit.Interface;

import Unit.*;

public interface Move {

    default void moveTo(Unit unit, int x, int y){
        if (unit instanceof GroundUnit){
            unit.setX(x);
            unit.setY(y);
            System.out.println(unit.getNickName()+" : 지상이동 to Location("+x+", "+y+")");
        } else if (unit instanceof AirUnit){
            unit.setX(x);
            unit.setY(y);
            System.out.println(unit.getNickName()+" : 공중이동 to Location("+x+", "+y+")");
        }
        //1. 시즈모드나 버로우 된 것들은? 걔내도 groundunit을 달고 있긴 해야 함. 그냥 if를 하나 더 달아서 이동불가인지 검사?
        //2. 이동을 walkable 과 flyable 인터페이스로 나눠서 하려다 move, stop, attack이 유닛 대부분이 갖는 공통 동작이라
        //이 세 동작을 basicControl로 묶어서 구현
    }
}
