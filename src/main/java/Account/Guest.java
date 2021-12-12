package Account;

import Ticket.Ticket;

public class Guest extends Account{
    int guestId;
    String guestName;
    String phoneNumber;
    Ticket ticket;

    public Guest(String guestName, String phoneNumber) {
        super(AccountType.GUEST);
        this.guestId = GetGuestNumber.getInstance().getNextGuestId();
        this.guestName = guestName;
        this.phoneNumber = phoneNumber;
    }

    public int getGuestId() {
        return guestId;
    }

    public void assignTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
