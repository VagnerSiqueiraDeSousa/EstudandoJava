package br.com.exercism.java.model.bicycle;

public class Bicycle {
    //the Bicycle class three fields
    public int candence;
    public int gear;
    public int speed;

    //the Bicycle class has
    //one constructor
    public Bicycle(int candence, int gear, int speed) {
        this.candence = candence;
        this.gear = gear;
        this.speed = speed;
    }

    //the Bicycle class has four methods
    public void setCandence(int newValue){
        candence = newValue;
    }

    public void setGear(int newValue){
        gear = newValue;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void setSpeedUp(int increment){
        speed += increment;
    }
}
