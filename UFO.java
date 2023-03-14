package org.example;

//Now, I will create a UFO class that inherits from the Plane class.
public class UFO extends Plane {

    String Engine = "";

    String batteryLife = "";

    int planetsTraveled = 0;

    String homeWorld = "";

    public UFO (String inBrand, double inSpeed, int inPassengers, int inVehicleWeight, int inWings, String inEngine, String inBatteryLife, int inPlanetsTraveled, String inHomeWorld){
        //Here, I will call upon the super constructor to call on the parent class's constructor.
        super(inBrand, inSpeed, inPassengers, inVehicleWeight, inWings);
        Engine = inEngine;
        batteryLife = inBatteryLife;
        planetsTraveled = inPlanetsTraveled;
        homeWorld = inHomeWorld;
    }

    //Here, I will establish the getters and setters for the class.

    public String getEngine(){
        return Engine;
    }

    public void setEngine(String inEngine) {
        Engine = inEngine;
    }

    public String getBatteryLife(){
        return batteryLife;
    }

    public void setBatteryLife(String inBatteryLife) {
        batteryLife = inBatteryLife;
    }

    public int getPlanetsTraveled(){
        return planetsTraveled;
    }

    public void setPlanetsTraveled(int inPlanetsTraveled){
        planetsTraveled = inPlanetsTraveled;
    }

    public String getHomeWorld() {
        return homeWorld;
    }

    public void setHomeWorld(String inHomeWorld) {
        homeWorld = inHomeWorld;
    }

    //Lastly, I will add this class's additions to the toString.

    public String toString(){
        String result = super.toString() +
                "Engine type \t" + getEngine() + ".\n" +
                "Range before re-charge: \t" + getBatteryLife() + ".\n" +
                "Planets traveled : \t" + getPlanetsTraveled()  + "\n" +
                "Home world : \t" + getHomeWorld() + ".\n";
        return  result;
    }
}
