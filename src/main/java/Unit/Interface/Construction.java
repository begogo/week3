package Unit.Interface;

import Unit.*;

public interface Construction {
    default void construct(Unit unit){
        System.out.println(unit.getNickName()+": 건설 시작!");
    }
}
