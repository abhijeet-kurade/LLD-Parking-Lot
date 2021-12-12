package Account;

import Ticket.Ticket;
import Vehicle.Vehicle;

import java.util.List;

public class User extends Account{
    private int userId;
    private String userName;
    private String password;
    private String phoneNumber;
    private List<Vehicle> vehicles;
    private List<Ticket> tickets;

    public User(String userName, String password, String phoneNumber) {
        super(AccountType.USER);
        this.userId = GetUserNumber.getInstance().getNextUserId();
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }
}
