package org.example;

import java.text.NumberFormat;

//Now, I will create a cargoFreight class that inherits from the Boat class.
public class cargoFreight extends Boat{

    double cargoWeight = 0.0;

    int maxContainers = 0;

    public cargoFreight(String inBrand, double inSpeed, int inPassengers, int inVehicleWeight, int inBoatLength, String inEngine, double inCargoWeight, int inMaxContainers) {
        //Here, I will call upon the super constructor to call on the parent class's constructor.
        super(inBrand, inSpeed, inPassengers, inVehicleWeight, inBoatLength, inEngine);
        cargoWeight = inCargoWeight;
        maxContainers = inMaxContainers;
    }

    //Here, I will establish the getters and setters for the class.
    public double getCargoWeight(){
        return  cargoWeight;
    }

    public void setCargoWeight(double inCargoWeight){
        cargoWeight = inCargoWeight;
    }

    public int getMaxContainer(){
        return  maxContainers;
    }

    public void setMaxContainers(int inMaxContainers){
        maxContainers = inMaxContainers;
    }

    //Here, I will create a number formatter to better display my data.
    NumberFormat fmt1 = NumberFormat.getInstance();

    //Lastly, I will add this class's additions to the toString.
    public String toString(){
        String result = super.toString() +
                "Potential cargo load (lbs): \t" + fmt1.format(getCargoWeight()) + "\n" +
                "Maximum container capacity: \t" + fmt1.format(getMaxContainer())+ "\n";
        return  result;
    }

}
