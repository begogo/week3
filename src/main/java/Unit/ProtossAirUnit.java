package Unit;

public abstract class ProtossAirUnit extends AirUnit{

    private int maxShield;
    private int currentShield;
    private final String RACE;

    public ProtossAirUnit(String nickName, String unitName, int maxHp, int currentHp, int maxShield, int currentShield, int atkDamage, String atkTarget, int x, int y) {
        super(nickName, unitName, maxHp, currentHp, atkDamage, atkTarget, x, y);
        this.maxShield = maxShield;
        this.currentShield = currentShield;
        this.RACE = "Protoss";
    }

    public int getMaxShield() {
        return maxShield;
    }

    public int getCurrentShield() {
        return currentShield;
    }

    public String getRACE() {
        return RACE;
    }
}
