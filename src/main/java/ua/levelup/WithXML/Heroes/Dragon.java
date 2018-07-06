package ua.levelup.WithXML.Heroes;

public class Dragon extends Monster {
    public Dragon(){
        super();
    }

    public Dragon(int power){
        super(power);
    }

    @Override
    public void appearance() {
        System.out.println("I am dragon. I am gonna burn this village.\n"); //Дракон грозит сжечь деревню
    }

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
