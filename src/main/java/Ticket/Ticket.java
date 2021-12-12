package Ticket;

import Account.Account;
import PakingLot.Floor;
import PakingLot.Spot;
import Vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    int ticketNumber;
    LocalDateTime start;
    LocalDateTime end;
    Vehicle vehicle;
    Floor floor;
    Spot spot;
    TicketStatus entryStatus;
    Account account;

    public Ticket(Vehicle vehicle, Floor floor, Spot spot, Account account) {
        this.ticketNumber = GetTicketNumber.getInstance().getNextTicketId();
        this.start = LocalDateTime.now();
        this.vehicle = vehicle;
        this.floor = floor;
        this.spot = spot;
        this.entryStatus = TicketStatus.PARKED;
        this.account = account;
    }

    public boolean completeEntry(){
        this.end = LocalDateTime.now();
        this.entryStatus = TicketStatus.COMPLETED;
        return true;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Floor getFloor() {
        return floor;
    }

    public Spot getSpot() {
        return spot;
    }

    public TicketStatus getEntryStatus() {
        return entryStatus;
    }

    public Account getAccount() {
        return account;
    }
}
