package Unit;

public abstract class Unit {
    public String unitName;
    public String nickName;
    public int currentHp;
    public int atkDamage;
    public boolean isAlive;
    public int x;
    public int y;

    public Unit(String nickName, int x, int y){
        this.nickName = nickName;
        this.x = x;
        this.y = y;
        this.isAlive = true;
        System.out.println(nickName+" - 생산완료 "+"Location("+x+", "+y+")");
    }

    public void checkAlive (Unit unit){
        if (currentHp <= 0) {
            this.isAlive = false;
            unit = null; //유닛 hp0 될 때 객체 삭제하려고 한 건데 작동안됨
            System.out.println(nickName+" - dead");
            return;
        }
        System.out.println(nickName+" - alive");
    }

    public String tellNickName(){
        return "닉네임:" + nickName;
    }

    public String tellRest(){
        return " /유닛명:" + unitName + " /현재HP:" + currentHp + " /공격력:" + atkDamage
                + " /생존:" + isAlive + " /Location(" + x + ", " + y + ")";
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
