package ParkingStrategy;

import PakingLot.Spot;

import java.util.*;

public class Strategy1 extends Strategy{
    PriorityQueue<Spot> emptySpots;
    HashMap<Integer, Spot> parkedSpot;
    public Strategy1(List<Spot> spots) {
        this.emptySpots = new PriorityQueue<>(
                Comparator.comparingInt(Spot::getSpotNumber)
        );
        this.parkedSpot = new HashMap<>();
        for(Spot spot : spots) this.emptySpots.add(spot);
    }

    @Override
    public boolean isFloorFull() {
        return emptySpots.isEmpty();
    }

    @Override
    public Spot getNextAvailableSpot() {
        Spot spot = emptySpots.poll();
        parkedSpot.put(spot.getSpotNumber(), spot);
        return spot;
    }

    public Spot peekNextAvailableSpot() {
        Spot spot = emptySpots.peek();
        return spot;
    }

    @Override
    public boolean freeSpot(Spot spot) {
        int spotNumber = spot.getSpotNumber();
        return freeSpot(spotNumber);
    }

    @Override
    public boolean addSpot(Spot spot) {
        this.emptySpots.add(spot);
        return true;
    }

    public boolean freeSpot(int spotNumber) {
        Spot spot = this.parkedSpot.remove(spotNumber);
        this.emptySpots.add(spot);
        return true;
    }
}
