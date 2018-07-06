package ua.levelup.WithAnnotations.Heroes;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Aspect
public class Dragon extends Monster {
    @Pointcut("execution(* ua.levelup.WithAnnotations.Heroes.BraveKnight.embarkOnQuest(..))")
    public void battle(){}

    public Dragon(){
        super();
    }

    @Autowired
    public Dragon(@Value("9")int power){
        super(power);
    }

    @Before("battle()")
    @Override
    public void appearance() {
        System.out.println("I am dragon. I am gonna burn this village.\n"); //Дракон грозит сжечь деревню
    }

    @AfterThrowing("battle()")
    @Override
    public void doSomethingBad(){
        System.out.println("Dragon is burning the village\n");    //Дракон сжигает деревню
    }

    @Override
    public void die() {
        System.out.println("Dragon is dead. He lost all his heads.\n"); //Дракон мертв
        this.setAlive(false);
    }
}
