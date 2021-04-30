package Unit;

public abstract class ZergAirUnit extends AirUnit {

    private final String RACE;

    public ZergAirUnit(String nickName, String unitName, int maxHp, int currentHp, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, maxHp, currentHp, atkDamage, atkTarget, x, y);
        this.RACE = "Zerg";
    }

    public String getRACE() {
        return RACE;
    }
}
