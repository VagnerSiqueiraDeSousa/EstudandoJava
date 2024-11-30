package br.com.exercism.java.model.bicycle;

public class MoutainBike extends Bicycle{
    // The MoutainBike subClasse has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MoutainBike(int startHeight, int startCandence, int startGear, int startSpeed) {
        super(startCandence, startGear, startSpeed);
        seatHeight = startHeight;
    }
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
}



