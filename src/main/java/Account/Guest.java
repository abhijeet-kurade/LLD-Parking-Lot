package Account;

import Ticket.Ticket;

public class Guest extends Account{
    Ticket ticket;

    public Guest(String guestName, String phoneNumber) {
        super(AccountType.GUEST, guestName, phoneNumber);
    }


    public void assignTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
