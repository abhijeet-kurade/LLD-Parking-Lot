package PakingLot;

import Ticket.Ticket;
import Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Spot {
    private int spotNumber;
    private boolean isEmpty;
    private SpotType spotType;
    private Vehicle vehicle;
    List<Ticket> entries;

    public Spot(int spotNumber, SpotType spotType) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        this.isEmpty = true;
        this.entries = new ArrayList<>();
    }

    public int park(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isEmpty = false;
        return this.spotNumber;
    }

    public void freeSpot(){
        this.vehicle = null;
        this.isEmpty = true;
    }
    public List<Ticket> showHistory(){
        return this.entries;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
