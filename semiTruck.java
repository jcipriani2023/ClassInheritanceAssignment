package org.example;

import java.text.Format;
import java.text.NumberFormat;

//Now, I will create a semiTruck class that inherits from the Car class.
public class semiTruck extends Car{

    double cargoWeight = 0.0;


    public semiTruck (String inBrand, double inSpeed, int inPassengers, int inVehicleWeight, int inMPG, String inColor, int inWheels, String inEngine, int inHorsePower, double inCargoWeight){
        //Here, I will call upon the super constructor to call on the parent class's constructor.
        super(inBrand, inSpeed, inPassengers, inVehicleWeight, inMPG, inColor, inWheels, inEngine, inHorsePower);
        cargoWeight = inCargoWeight;
    }

    //Here, I will establish the getters and setters for the class.

    public double getCargoWeight(){
        return  cargoWeight;
    }

    public void setCargoWeight(double inCargoWeight){
        cargoWeight = inCargoWeight;
    }


    //Here, I will create a number formatter to better display my data.
    NumberFormat fmt1 = NumberFormat.getInstance();

    //Lastly, I will add this class's additions to the toString.

    public String toString(){
        String result = super.toString() +
                "Potential cargo load (lbs): \t" + fmt1.format(getCargoWeight()) + "\n";
        return  result;
    }

}
