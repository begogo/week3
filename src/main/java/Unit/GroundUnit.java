package Unit;

public abstract class GroundUnit extends Unit {
    public String activityArea = "ground";

    public GroundUnit(String nickName, int x, int y){
        super(nickName, x, y);
    }
}
