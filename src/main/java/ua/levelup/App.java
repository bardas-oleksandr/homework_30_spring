package ua.levelup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.levelup.WithXML.Heroes.BraveKnight;
import ua.levelup.WithXML.Heroes.DeadKnightException;
import ua.levelup.WithXML.Heroes.Dragon;
import ua.levelup.WithXML.Heroes.GoodGuy;

public class App {
    public static void main( String[] args ) {
        //Some changes
        System.out.println("===============Dependency injection with XML-config file=================\n");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");

        BraveKnight bobby = (BraveKnight) ctx.getBean("Bobby");
        try{
            bobby.embarkOnQuest();    //Рыцарь Боб принимает вызов
        }catch (DeadKnightException e){
            System.out.println("Everybody in the village is dead");    //В деревне все мертвы
        }

        System.out.println("===============Dependency injection with annotations=====================\n");
        //Тот же самый сценарий, только через AspectJ и рыцарь в этот раз сильнее
        ua.levelup.WithAnnotations.Heroes.GoodGuy jack =
                (ua.levelup.WithAnnotations.Heroes.BraveKnight)ctx.getBean("jack");
        try {
            jack.embarkOnQuest();
        } catch (DeadKnightException e) {
            System.out.println("Everybody in the village is dead");
        }
    }
}
