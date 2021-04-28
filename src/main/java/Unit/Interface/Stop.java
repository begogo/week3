package Unit.Interface;

import Unit.*;

public interface Stop {

    default void stop(Unit unit){
        System.out.println(unit.nickName+" : 정지 at Location("+unit.x+", "+unit.y+")" );
    }

}
