package Unit;

public abstract class Unit {
    private String unitName;
    private String nickName;
    private final int MAXHP;
    private int currentHp;
    private int atkDamage;
    private int x;
    private int y;
    private boolean isAlive;
    private String atkTarget;

    public Unit(String nickName, String unitName, int MAXHP, int currentHp, int atkDamage, String atkTarget, int x, int y){
        this.nickName = nickName;
        this.unitName = unitName;
        this.MAXHP = MAXHP;
        this.currentHp = currentHp;
        this.atkDamage = atkDamage;
        this.atkTarget = atkTarget;
        this.x = x;
        this.y = y;
        this.isAlive = true;
        System.out.println(nickName+" - 생산완료 "+"Location("+x+", "+y+")");
    }

    public boolean checkAlive (Unit unit){
        if (currentHp <= 0) {
            this.setCurrentHp(0);
            this.isAlive = false;
            unit = null; //유닛 hp0 될 때 객체 삭제하려고 한 건데 작동안됨
            System.out.println(nickName+" - dead");
            return false;
        }
        System.out.println(nickName+" - alive");
        return true;
    }

    public String tellNickName(){
        return "닉네임:" + nickName;
    }

    public String tellRest(){
        return " / 유닛명:" + unitName + " / 최대HP:" + MAXHP + " / 현재HP:" + currentHp + " / 공격력:" + atkDamage
                + " / 생존:" + isAlive + " / Location(" + x + ", " + y + ")";
    }

    //setter
    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //getter
    public String getUnitName() {
        return unitName;
    }

    public String getNickName() {
        return nickName;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getAtkDamage() {
        return atkDamage;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getAtkTarget() {
        return atkTarget;
    }

}

//    @Override
//    public String toString(){
//        return "이름: "+this.unitName+"%n현재HP: "+this.currentHp+"%n공격력: "+this.atkDamage+"%n위치: ("+this.x+", "+this.y+")%n";
//    }

//    public String[] hotKey;
//    public int mineral;
//    public int gas;
//    public int supply;
//    public int mp;
//    public int armor;
//    public String atkType;
//    public int atkRange;
//    public int atkSpeed;
//    public float moveSpeed;
//    public int vision;
//    public String[] atkTarget;
//    public String activityArea;
//    public String size;
//    public boolean transportable;
//    public int transportSize;
