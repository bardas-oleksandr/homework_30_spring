package ua.levelup.WithXML.Heroes;

import ua.levelup.WithXML.Quests.Quest;

public class BraveKnight extends GoodGuy {
    public BraveKnight(){
        super();
    }

    public BraveKnight(Quest quest, int power){
        super(quest,power);
    }

    @Override
    public void embarkOnQuest() throws DeadKnightException {
        System.out.println("I am brave knight. And I am not gonna let you do it.\n");   //Рыцарь собирается
        //остановить дракона
        try{
            this.getQuest().embark(this);
        }catch (DeadKnightException e){
            //Рыцарь не ожидал что у дракона так много голов
            System.out.println("Ooops, why didn't anybody warn me that dragon has so many heads?\n");
            this.die();
            throw new DeadKnightException();
        }
        System.out.println("Brave knight won this battle.\n");  //Рыцарь победил
    }

    @Override
    public void die() {
        System.out.println("Rest in peace, brave knight...\n"); //Пусть земля рыцарю будет пухом
        this.setAlive(false);
    }
}
