package Unit;

public abstract class AirUnit extends Unit {

    private String activityArea;

    public AirUnit(String nickName, String unitName, int MAXHP, int currentHp, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, MAXHP, currentHp, atkDamage, atkTarget, x, y);
        activityArea = "air";
    }

    public String getActivityArea() {
        return activityArea;
    }

}
