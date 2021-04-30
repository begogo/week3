package Unit;

public abstract class ZergGroundUnit extends GroundUnit{

    private final String RACE;

    public ZergGroundUnit(String nickName, String unitName, int maxHp, int currentHp, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, maxHp, currentHp, atkDamage, atkTarget, x, y);
        this.RACE = "Zerg";
    }

    public String getRACE() {
        return RACE;
    }
}
