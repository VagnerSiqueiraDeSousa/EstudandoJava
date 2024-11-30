package br.com.exercism.java.model.bicycle;

public class Bicycle {
    //the Bicycle class three fields
    private int candence;
    private int gear;
    private int speed;

    //the Bicycle class has
    //one constructor
    public Bicycle(int startCandence, int startGear, int startSpeed) {
        this.candence = startCandence;
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public Bicycle(){
        gear = 1;
        candence = 10;
        speed = 0;
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

    @Override
    public String  toString() {
        return "Bicycle{" +
                "candence=" + candence +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
