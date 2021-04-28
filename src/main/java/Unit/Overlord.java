package Unit;

import Unit.Interface.*;

public class Overlord extends AirUnit implements Zerg, Move, Stop, Detectable {

    int increaseSupply = 8;
    final int MAXHP = 200;

    public Overlord(String nickName, int x, int y){
        super(nickName, x, y);
        this.unitName = "오버로드";
        this.currentHp = MAXHP;
    }



}
