package ua.levelup.WithAnnotations.Quests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ua.levelup.WithAnnotations.Heroes.GoodGuy;
import ua.levelup.WithAnnotations.Heroes.Monster;
import ua.levelup.WithXML.Heroes.DeadKnightException;

@Service("slayMonsterQuest")
public class SlayMonsterQuest implements Quest {
    private Monster monster;

    public SlayMonsterQuest() {
        this.monster = null;
    }

    @Autowired
    public SlayMonsterQuest(@Value("#{bigDragon}")Monster monster) {
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
