package Resource;

public abstract class Resource {
    public String name;
    public int x;
    public int y;

    public Resource (String name, int x, int y){
        System.out.println(name+" - 생성완료 "+"Location("+x+", "+y+")");
        this.name = name;
        this.x = x;
        this.y = y;
    }

}
