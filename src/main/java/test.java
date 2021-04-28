public class test {
    public static void main(String[] args) {
        Animal hAnimal1 = new Human();
        Human hAnimal2 = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        hAnimal1.move();
//        hAnimal1.readBooks();
        ((Human)hAnimal1).readBooks();
        System.out.println();

        hAnimal2.move();
        hAnimal2.readBooks();
        System.out.println();

        tAnimal.move();
        ((Tiger)tAnimal).move2();
        System.out.println();

        eAnimal.move();
    }
}

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    void move2(){
        move();
        super.move();
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }
    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}