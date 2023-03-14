package org.example;

//Now, I will create a Car class that inherits from the Vehicle class.
public class Car extends Vehicle{

    int wheels = 4;

    String color = "White";

    String engine = "";

    int horsePower = 0;

    double mpg = 0.0; //has an extra variable, mpg

    public Car(String inBrand, double inSpeed, int inPassengers, int inVehicleWeight, int inMPG, String inColor, int inWheels, String inEngine, int inHorsePower){
        //Here, I will call upon the super constructor to call on the parent class's constructor.
        super(inBrand, inSpeed, inPassengers, inVehicleWeight);
        mpg = inMPG;
        color = inColor;
        wheels = inWheels;
        engine = inEngine;
        horsePower = inHorsePower;
    }

    //Here, I will establish the getters and setters for the class.
    public double getMPG(){
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public int getWheels(){
        return wheels;
    }

    public void setWheels(int wheels){this.wheels = wheels;}

    public String getColor(){
        return color;
    }

    public void setColor(String color){this.color = color;}

    public String getEngine(){return engine;}

    public void setEngine(String engine){this.engine = engine;}

    public int getHorsePower(){return horsePower;}

    public void setHorsePower(int horsePower){this.horsePower = horsePower;}



    //Lastly, I will add this class's additions to the toString.

    public String toString(){
        String result = super.toString() +
                "MPG :\t" + this.getMPG() + "\n" +
                "Wheels :\t" + this.getWheels() + "\n" +
                "Color : \t" + this.getColor() + "\n" +
                "Engine Type: \t" + this.getEngine() + "\n" +
                "Horsepower: \t" + this.getHorsePower() + "\n";
        return  result ;
    }
}
