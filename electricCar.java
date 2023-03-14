package org.example;

//Now, I will create an electric car class that inherits from the Car class.
public class electricCar extends Car {

    double batteryLife = 0.0;

    int MPC = 0;

    double chargeTime = 0.0;

    public electricCar (String inBrand, double inSpeed, int inPassengers, int inVehicleWeight, int inMPG, String inColor, int inWheels, String inEngine, int inHorsePower, double inBatteryLife, int inMPC, double inChargeTime) {
        //Here, I will call upon the super constructor to call on the parent class's constructor.
        super (inBrand, inSpeed, inPassengers, inVehicleWeight, inMPG, inColor, inWheels, inEngine, inHorsePower);
        batteryLife = inBatteryLife;
        MPC = inMPC;
        chargeTime = inChargeTime;
    }

    //Now, I will establish the getters and setters for the class.
    public double getBatteryLife(){
        return  batteryLife;
    }

    public void setBatteryLife(double inBatteryLife) {
        batteryLife = inBatteryLife;
    }

    public int getMPC() {return MPC;}

    public void setMPC(int inMPC){
    MPC = inMPC;
    }

    public double getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(double inChargeTime) {
        chargeTime = inChargeTime;
    }

    //Lastly, I will add this class's additions to the toString.

    public String toString(){
        String result = super.toString() +
                "Life of battery on full charge without driving: \t" + getBatteryLife() + " hours. \n" +
                "Range per full charge: \t" + getMPC() + " miles.\n" +
                "Time to fully charge from dead battery : \t" + getChargeTime()  + " hours. \n";
        return  result;
    }
}


