package Account;

import Ticket.Ticket;
import Vehicle.Vehicle;

import java.util.HashMap;
import java.util.List;

public class User extends Account{
    private String password;
    private HashMap<String, Vehicle> vehicles;
    private HashMap<Integer, Ticket> tickets;

    public User(String userName, String password, String phoneNumber) {
        super(AccountType.USER, userName, phoneNumber);
        this.password = password;
        this.tickets = new HashMap<>();
    }


    public String getPassword() {
        return password;
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.put(vehicle.getVehicleNumber(), vehicle);
    }

    public void addTicket(Ticket ticket){
        this.tickets.put(ticket.getTicketNumber(), ticket);
    }

    public Vehicle getVehicles(String number) {
        return vehicles.get(number);
    }

    public Ticket getTickets(int number) {
        return tickets.get(number);
    }
}
