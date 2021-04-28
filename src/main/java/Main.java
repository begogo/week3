
import Resource.*;
import Unit.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------객 체 생 성-----------------------------------------");
        Scv scv1 = new Scv("SCV @1",100, 200);
        Scv scv2 = new Scv("SCV @2",33, 111);
        BattleCruiser bc = new BattleCruiser("Battlecruiser @1",50, 100);
        Marine marine = new Marine("Marine @1",123, 123);
        Mineral mineral1 = new Mineral("미네랄1", 22, 33);
        Gas gas1 = new Gas("가스1", 55, 44);
        System.out.println("-----------------------------------상 태 출 력---------------------------------------");
        System.out.println(scv1.tellNickName() + " /종족:"+scv1.RACE + scv1.tellRest() + " /활동영역:"+scv1.activityArea);
        System.out.println(scv2.tellNickName() + " /종족:"+scv2.RACE + scv2.tellRest() + " /활동영역:"+scv2.activityArea);
        System.out.println(bc.tellNickName() + " /종족:"+bc.RACE + bc.tellRest() + " /활동영역:"+bc.activityArea);
        System.out.println(marine.tellNickName() + " /종족:"+marine.RACE + marine.tellRest() + " /활동영역:"+marine.activityArea);
        System.out.println("------------------------------------일 꾼 활 동--------------------------------------");
        scv1.gather(scv1, mineral1);
        scv2.gather(scv2, gas1);
        scv1.construct(scv1);
//        marine.gather(marine, mineral1);
        System.out.println("------------------------------------생 존 확 인--------------------------------------");
        scv2.currentHp = 0;
        scv2.checkAlive(scv2);
        System.out.println("------------------------------------유 닛 이 동------------------------------------------");
        scv1.moveTo(scv1, 111, 456);
        scv1.stop(scv1);
        bc.moveTo(bc, 22, 789);
        bc.stop(bc);
        System.out.println("------------------------------------유 닛 수 리------------------------------------------");
        scv1.repair(marine);
        scv1.repair(bc);

        // 객체가 변화됐을 때 처리: 탱크 시즈모드, 저그 버로우 같은거 됐을 때 이동 못 하게 하는거

    }
}
