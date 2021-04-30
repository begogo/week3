package Unit;

import Unit.Interface.*;

public abstract class Unit {
    private String unitName;
    private String nickName;
    private final int maxHp;
    private int currentHp;
    private int atkDamage;
    private int x;
    private int y;
    private boolean isAlive;
    private String atkTarget;

    public Unit(String nickName, String unitName, int maxHp, int currentHp, int atkDamage, String atkTarget, int x, int y){
        this.nickName = nickName;
        this.unitName = unitName;
        this.maxHp = maxHp;
        this.currentHp = currentHp;
        this.atkDamage = atkDamage;
        this.atkTarget = atkTarget;
        this.x = x;
        this.y = y;
        this.isAlive = true;
        System.out.println(nickName+" - 생산완료 "+"Location("+x+", "+y+")");
    }

    public boolean checkAlive (Unit unit){ //수정
        if (this.getCurrentHp() <= 0) {
            this.setCurrentHp(0);
            this.setIsAlive(false);
            unit = null; //유닛 hp0 될 때 객체 삭제하려고 한 건데 작동안됨
            System.out.println(this.getNickName()+" - dead");
            return false;
        }
        System.out.println(this.getNickName()+" - alive");
        return true;
    }

    //원래 쓰던 방식
//    public String tellNickName(){
//        return "닉네임:" + this.getNickName();
//    }
//
//    public String tellRest(){
//        return " / 유닛명:" + this.getUnitName() + " / 최대HP:" + this.getMaxHp() + " / 현재HP:" + this.getCurrentHp()
//                + " / 공격력:" + this.getAtkDamage() + " / 생존:" + this.getIsAlive() + " / Location(" + this.getX() + ", " + this.getY() + ")";
//    }

    public String tellNew(Unit unit) {
        if (unit instanceof TerranGroundUnit){
            return "닉네임:"+unit.getNickName()+" / 종족:"+((TerranGroundUnit)unit).getRACE() + tellRestTerranZerg(unit)
                    + " / 활동영역:" + ((TerranGroundUnit)unit).getActivityArea();

        } else if (unit instanceof TerranAirUnit){
            return "닉네임:"+unit.getNickName()+" / 종족:"+((TerranAirUnit)unit).getRACE() + tellRestTerranZerg(unit)
                    + " / 활동영역:" + ((TerranAirUnit)unit).getActivityArea();

        } else if (unit instanceof ProtossGroundUnit) {
            return "닉네임:" + unit.getNickName() + " / 종족:" + ((ProtossGroundUnit) unit).getRACE() + " / 유닛명:" + unit.getUnitName()
                    + " / 최대HP:" + unit.getMaxHp() + " / 현재HP:" + unit.getCurrentHp() + " / 최대실드:" + ((ProtossGroundUnit) unit).getMaxShield()
                    + " / 현재실드:" + ((ProtossGroundUnit) unit).getCurrentShield() + " / 공격력:" + unit.getAtkDamage()
                    + " / 생존:" + unit.getIsAlive() + " / Location(" + unit.getX() + ", " + unit.getY() + ")"
                    + " / 활동영역:" + ((ProtossGroundUnit) unit).getActivityArea();

        } else if (unit instanceof ProtossAirUnit) {
            return "닉네임:" + unit.getNickName() + " / 종족:" + ((ProtossAirUnit) unit).getRACE() + " / 유닛명:" + unit.getUnitName()
                    + " / 최대HP:" + unit.getMaxHp() + " / 현재HP:" + unit.getCurrentHp() + " / 최대실드:" + ((ProtossAirUnit) unit).getMaxShield()
                    + " / 현재실드:" + ((ProtossAirUnit) unit).getCurrentShield() + " / 공격력:" + unit.getAtkDamage()
                    + " / 생존:" + unit.getIsAlive() + " / Location(" + unit.getX() + ", " + unit.getY() + ")"
                    + " / 활동영역:" + ((ProtossAirUnit) unit).getActivityArea();

        } else if (unit instanceof ZergGroundUnit) {
            return "닉네임:" + unit.getNickName() + " / 종족:" + ((ZergGroundUnit) unit).getRACE() + tellRestTerranZerg(unit)
                    + " / 활동영역:" + ((ZergGroundUnit) unit).getActivityArea();

        } else if (unit instanceof ZergAirUnit) {
            return "닉네임:" + unit.getNickName() + " / 종족:" + ((ZergAirUnit) unit).getRACE() + tellRestTerranZerg(unit)
                    + " / 활동영역:" + ((ZergAirUnit) unit).getActivityArea();

        } else {
            return "분류없음";
        }

    }

    public String tellRestTerranZerg(Unit unit){
        return " / 유닛명:" + unit.getUnitName() + " / 최대HP:" + unit.getMaxHp() + " / 현재HP:" + unit.getCurrentHp()
                + " / 공격력:" + unit.getAtkDamage() + " / 생존:" + unit.getIsAlive()
                + " / Location(" + unit.getX() + ", " + unit.getY() + ")";
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

    public void setIsAlive(boolean alive) { isAlive = alive; }

    //getter
    public String getUnitName() {
        return unitName;
    }

    public String getNickName() {
        return nickName;
    }

    public int getMaxHp() { return maxHp; }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getAtkDamage() {
        return atkDamage;
    }

    public boolean getIsAlive() { return isAlive; }

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
