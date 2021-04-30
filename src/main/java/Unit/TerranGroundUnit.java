package Unit;

public abstract class TerranGroundUnit extends GroundUnit {

    private final String RACE;

    public TerranGroundUnit(String nickName, String unitName, int maxHp, int currentHp, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, maxHp, currentHp, atkDamage, atkTarget, x, y);
        this.RACE = "Terran";
    }

    public String getRACE() {
        return RACE;
    }
}
