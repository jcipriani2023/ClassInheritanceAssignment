package org.example;

//Now, I will create a fighterJet class that inherits from the Plane class.
public class fighterJet extends Plane {

    int jetEngines = 0;

    int missileCapacity = 0;

    public fighterJet (String inBrand, double inSpeed, int inPassengers, int inVehicleWeight, int inWings, int inJetEngines, int inMissileCapacity) {
        //Here, I will call upon the super constructor to call on the parent class's constructor.
        super(inBrand, inSpeed, inPassengers, inVehicleWeight, inWings); //uses the super constructor
        jetEngines = inJetEngines;
        missileCapacity = inMissileCapacity;
    }

    //Here, I will establish the getters and setters for the class.
    public int getJetEngines(){
        return jetEngines;
    }

    public void setJetEngines(int jetEngines) {
        this.jetEngines = jetEngines;
    }

    public int getMissileCapacity(){
        return missileCapacity;
    }

    public void setMissileCapacity(int missileCapacity) {
        this.missileCapacity = missileCapacity;
    }


    //Lastly, I will add this class's additions to the toString.

    public String toString(){
        String result = super.toString() +
                "Jet Engines :\t" + this.getJetEngines() + "\n" +
                "Missile Capacity :\t" + this.getMissileCapacity() + "\n";
        return  result ;
    }
}
