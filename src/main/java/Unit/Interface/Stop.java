package Unit.Interface;

import Unit.*;

public interface Stop {

    default void stop(Unit unit){
        System.out.println(unit.getNickName()+" : 정지 at Location("+unit.getX()+", "+unit.getY()+")" );
    }

}
