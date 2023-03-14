package org.example;

//Now, I will create a Plane class that inherits from the Vehicle class.
public class Plane extends Vehicle{

    int wings = 0;

    public Plane(String inBrand, double inSpeed, int inPassengers, int inVehicleWeight, int inWings) {
        //Here, I will call upon the super constructor to call on the parent class's constructor.
        super(inBrand, inSpeed, inPassengers, inVehicleWeight);
        wings = inWings;
    }

    //Here, I will establish the getters and setters for the class.

    public int getWings(){
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    //Lastly, I will add this class's additions to the toString.
    public String toString(){
        String result = super.toString() +
                "Wings :\t" + this.getWings() + "\n";
        return  result ;
    }
}


