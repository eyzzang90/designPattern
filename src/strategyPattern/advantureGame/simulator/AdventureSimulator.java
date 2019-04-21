package strategyPattern.advantureGame.simulator;

import strategyPattern.advantureGame.encapsulation.AxeBehavior;
import strategyPattern.advantureGame.encapsulation.BowAndArrowBehavior;
import strategyPattern.advantureGame.encapsulation.SwordBehavior;
import strategyPattern.advantureGame.model.Charactor;
import strategyPattern.advantureGame.model.King;
import strategyPattern.advantureGame.model.Troll;

public class AdventureSimulator {

    public static void main(String[] args) {

        System.out.println("--------캐릭터 선택을 합시다. 어떤것으로 하겠습니까? ---------");

        Charactor king = new King();
        System.out.println("[알림] 왕을 선택하였습니다.");
        king.fight();

        System.out.println("[알림] 왕의 기본공격기 입니다. 무기를 바꾸어 볼까요?");
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();

        System.out.println("[알림] 도끼의 내구도가 얼마 남지 않았습니다. 활로 바꿉니다.");
        king.setWeaponBehavior(new BowAndArrowBehavior());
        king.fight();

        System.out.println("----------왕이 죽었습니다. 새 캐릭터를 선택합니다.------------");

        Charactor troll = new Troll();
        System.out.println("[알림] 트롤을 선택하였습니다.");
        troll.fight();

        System.out.println("[알림] 트롤의 기본 공격기입니다. 무기를 바꿉니다.");
        troll.setWeaponBehavior(new SwordBehavior());
        troll.fight();

    }
}
