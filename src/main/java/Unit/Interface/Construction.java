package Unit.Interface;

import Unit.*;

public interface Construction {
    default void construct(Unit unit){
        System.out.println(unit.nickName+": 건설임무 시작");
    }
}
