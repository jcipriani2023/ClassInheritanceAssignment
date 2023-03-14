package org.example;

//Now, I will create a Boat class that inherits from the Vehicle class.
public class Boat extends Vehicle {

    int boatLength = 0;

    String Engine = "";

    public Boat(String inBrand, double inSpeed, int inPassengers, int inVehicleWeight, int inBoatLength, String inEngine) {
        //Here, I will call upon the super constructor to call on the parent class's constructor.
        super(inBrand, inSpeed, inPassengers, inVehicleWeight);
        boatLength = inBoatLength;
        Engine = inEngine;
    }

    //Here, I will establish the getters and setters for the class.
    public int getBoatLength(){
        return boatLength;
    }

    public void setBoatLength(int boatLength){this.boatLength = boatLength;}

    public String getEngine(){
        return Engine;
    }

    public void setEngine(String inEngine) {
        Engine = inEngine;
    }

    //Lastly, I will add this class's additions to the toString.
    public String toString(){
        String result = super.toString() +
                "Boat length: \t" + getBoatLength() + " ft.\n" +
                "Engine type: \t" + getEngine() + ".\n";
        return  result;
    }

}
