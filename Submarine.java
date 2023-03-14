package org.example;

//Now, I will create a Submarine class that inherits from the Boat class.

public class Submarine extends Boat{

    int maxDepth = 0;

    double maxUnderwaterTime = 0.0;

    int nuclearPayload = 0;

    public Submarine(String inBrand, double inSpeed, int inPassengers, int inVehicleWeight, int inBoatLength, String inEngine, int inMaxDepth, double inMaxUnderwaterTime, int inNuclearPayload) {
        //Here, I will call upon the super constructor to call on the parent class's constructor.
        super(inBrand, inSpeed, inPassengers, inVehicleWeight, inBoatLength, inEngine); //uses the super constructor
        maxDepth = inMaxDepth;
        maxUnderwaterTime = inMaxUnderwaterTime;
        nuclearPayload = inNuclearPayload;
    }

    //Here, I will establish the getters and setters for the class.

    public int getMaxDepth(){
        return maxDepth;
    }

    public void setMaxDepth(int maxDepth){this.maxDepth = maxDepth;}

    public double getMaxUnderwaterTime(){
        return maxUnderwaterTime;
    }

    public void setMaxUnderwaterTime(double maxUnderwaterTime){this.maxUnderwaterTime = maxUnderwaterTime;}

    public int getNuclearPayload(){
        return nuclearPayload;
    }

    public void setNuclearPayload(int nuclearPayload){this.nuclearPayload = nuclearPayload;}


    //Lastly, I will add this class's additions to the toString.

    public String toString(){
        String result = super.toString() +
                "Max underwater depth: \t" + getMaxDepth() + " ft.\n" +
                "Max underwater time before resurfacing: \t" + getMaxUnderwaterTime() + " months.\n" +
                "Intercontinental ballistic missile capacity \t" + getNuclearPayload() + "\n";
        return  result;
    }


}
