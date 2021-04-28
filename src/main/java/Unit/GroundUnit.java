package Unit;

public abstract class GroundUnit extends Unit {

    private String activityArea;

    public GroundUnit(String nickName, String unitName, int MAXHP, int currentHp, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, MAXHP, currentHp, atkDamage, atkTarget, x, y);
        this.activityArea = "ground";
    }

    public String getActivityArea() {
        return activityArea;
    }
}
