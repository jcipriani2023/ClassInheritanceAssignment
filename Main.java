package org.example;

public class Main {
    public static void main(String[] args){
        //Here, I will create an object from each inherited class and print out its specs.
        semiTruck Car1 = new semiTruck("Volvo VNL 760", 100, 6, 18000, 8, "Red", 6, "13-liter, Inline 6 Diesel", 425, 80000);
        System.out.println(Car1);
        electricCar Car2 = new electricCar("Telsa Model 3", 140, 5, 4250, 0, "Blue", 4, "Electric", 180, 1440, 335, 13);
        System.out.println(Car2);
        fighterJet Plane1 = new fighterJet("F22", 200, 2,2000,2, 2, 6);
        System.out.println(Plane1);
        UFO Plane2 = new UFO("Unknown", 670616629, 3, 20, 0, "Anti-gravity propulsion", "Infinite", 986, "Unknown");
        System.out.println(Plane2);
        Submarine Boat1 = new Submarine("USS Alabama", 29, 155, 33528000, 560, "One S8G PWR nuclear reactor and one 325hp auxiliary motor", 800, 3, 20);
        System.out.println(Boat1);
        cargoFreight Boat2 = new cargoFreight("Morrex Cargo", 21,12,  200000000, 740, "Wärtsilä-Sulzer RTA96-C", 500000 , 1000);
        System.out.println(Boat2);
    }
}

