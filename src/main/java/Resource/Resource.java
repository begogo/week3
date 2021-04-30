package Resource;

public abstract class Resource {
    private String name;
    private int x;
    private int y;

    public Resource (String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
        System.out.println(name+" - 생성완료 "+"Location("+x+", "+y+")");
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
