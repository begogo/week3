package Unit.Interface;

import Resource.*;
import Unit.*;

public interface ResourceGatherable {
    default void gather(Unit unit, Resource resource){
        System.out.println(unit.getNickName()+": "+resource.getName()+" 채집 시작!");
    }
}
