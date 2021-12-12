package ParkingStrategy;

import PakingLot.Spot;

import java.util.Collection;

public abstract class Strategy {

    public abstract boolean isFloorFull();

    public abstract Spot getNextAvailableSpot();

    public abstract boolean freeSpot(Spot spot);

    public abstract boolean addSpot(Spot spot);
}
