package Ticket;

import Account.Account;
import PakingLot.Spot;
import Vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    int ticketNumber;
    LocalDateTime start;
    LocalDateTime end;
    Vehicle vehicle;
    Spot spot;
    TicketStatus entryStatus;
    Account account;

    public Ticket(Vehicle vehicle, Spot spot, Account account) {
        this.ticketNumber = GetTicketNumber.getInstance().getNextTicketId();
        this.start = LocalDateTime.now();
        this.vehicle = vehicle;
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
}
