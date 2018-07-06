package ua.levelup.WithXML.Quests;

import ua.levelup.WithXML.Heroes.DeadKnightException;
import ua.levelup.WithXML.Heroes.GoodGuy;
import ua.levelup.WithXML.Heroes.Monster;

public class SlayMonsterQuest implements Quest {
    private Monster monster;

    public SlayMonsterQuest() {
        this.monster = null;
    }

    public SlayMonsterQuest(Monster monster) {
        this.monster = monster;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    //Метод "сражение с монстром"
    @Override
    public void embark(GoodGuy contestant) throws DeadKnightException {
        if (monster.getPower() > contestant.getPower()) {   //Если сила монстра больше силы рыцаря
            throw new DeadKnightException();    //Исключение "Мертвый рыцарь"
        }
        monster.die();  //Монстр погибает
    }
}
