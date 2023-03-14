package org.example;
import java.text.NumberFormat;

//Here, I will create a base Vehicle class.
public class Vehicle {
    //base (Class wide) variables
    protected String brandName = "";
    protected double speed = 0.0;
    protected int passengers = 0;
    protected double vehicleWeight = 0;

    //Base default constructor
    public Vehicle(){
        brandName = "";
        speed = 0.0;
        passengers = 0;
        vehicleWeight = 0;
    }

    public Vehicle(String inBrand, double inSpeed, int inPassengers, double inVehicleWeight){
        brandName = inBrand;
        speed = inSpeed;
        passengers = inPassengers;
        vehicleWeight = inVehicleWeight;
    }

    //Here, I will establish the getters and setters for this class.
    public Vehicle(String inBrand){
        brandName = inBrand;
    }

    public String getBrand(){
        return brandName;
    }

    public  void setBrandName(String inBrand){
        brandName = inBrand;
    }

    public double getSpeed(){
        return  speed;
    }

    public void setSpeed(double inSpeed){
        speed = inSpeed;
    }

    public int getPassengers(){
        return  passengers;
    }

    public void setPassengers(int inPassengers){
        passengers = inPassengers;
    }

    public double getVehicleWeight(){
        return  vehicleWeight;
    }

    public void setVehicleWeight(double inVehicleWeight){
        vehicleWeight = inVehicleWeight;
    }

    //Here, I will establish formatter to format my large numbers.
    NumberFormat fmt1 = NumberFormat.getInstance();

    //Now, I will add this class's additions to the toString.
    public String toString(){
        String result = "";
        result = "Brand: \t" + getBrand() + "\n" +
                "Speed (mph): \t" + fmt1.format(getSpeed()) + "\n" +
                "Passengers: \t" + getPassengers() + "\n" +
                "Vehicle weight (lbs): \t" + fmt1.format(getVehicleWeight()) + "\n";
        return result;
    }
}
