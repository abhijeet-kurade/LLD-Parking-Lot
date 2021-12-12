package PakingLot;

import ParkingStrategy.Strategy;
import ParkingStrategy.Strategy1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingLot {
    private String name;
    private int numberOfFloors;
    private HashMap<String, Floor> floors;

    public ParkingLot(String name, int numberOfFloors) {
        this.name = name;
        this.numberOfFloors = numberOfFloors;
        for (int i=1; i<=numberOfFloors; i++){
            String floorName = "Floor" + 1;
            Strategy strategy = new Strategy1(new ArrayList<>());
            this.floors.put(floorName, new Floor(floorName, 20, strategy));
        }
    }

    public Floor getFloor(String floorName){
        return this.floors.get(floorName);
    }
}
