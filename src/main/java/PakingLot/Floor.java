package PakingLot;

import ParkingStrategy.Strategy;
import Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private Strategy strategy;
    private String floorName;
    private List<Spot> spots;
    private int numberOfSpots;


    public Floor(String floorName, int numberOfSpots, Strategy strategy) {
        this.strategy = strategy;
        this.floorName = floorName;
        this.numberOfSpots = numberOfSpots;
        this.spots = new ArrayList<>();
        for(int i=1; i<=numberOfSpots;i++){
            Spot spot = new Spot(i, SpotType.LARGE);
            this.spots.add(spot);
            this.strategy.addSpot(spot);
        }
    }

    public int park(Vehicle vehicle){
        if(strategy.isFloorFull()) return -1;
        Spot spot = strategy.getNextAvailableSpot();
        return spot.park(vehicle);
    }

    public boolean freeSpot(int spotNumber){
        Spot spot = this.getSpot(spotNumber);
        spot.freeSpot();
        this.strategy.freeSpot(spot);
        return true;
    }

    public Spot getSpot(int spotNumber){
        return this.spots.get(spotNumber-1);
    }
    public boolean isFloorFull(){
        return this.strategy.isFloorFull();
    }
}
