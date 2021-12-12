package Ticket;

public class GetTicketNumber {
    private int number=0;
    private static GetTicketNumber obj;
    private GetTicketNumber() {

    }
    public static GetTicketNumber getInstance(){
        if(GetTicketNumber.obj == null) GetTicketNumber.obj = new GetTicketNumber();
        return GetTicketNumber.obj;
    }

    public int getNextTicketId(){
        this.number += 1;
        return this.number;
    }
}
