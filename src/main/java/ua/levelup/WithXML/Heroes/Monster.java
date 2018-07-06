package ua.levelup.WithXML.Heroes;

public abstract class Monster extends LivingBeing {
    public Monster(){
        super();
    }

    public Monster(int power){
        super(power);
    }

    public abstract void appearance();  //Появление на сцене

    public abstract void doSomethingBad();  //Сделать что-то плохое
}
