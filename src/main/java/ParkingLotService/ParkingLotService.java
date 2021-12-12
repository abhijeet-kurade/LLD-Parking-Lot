package ParkingLotService;

import Account.*;
import PakingLot.Floor;
import PakingLot.ParkingLot;
import Ticket.*;
import Vehicle.*;

import java.util.HashMap;

public class ParkingLotService {
    private ParkingLot parkingLot;
    HashMap<Integer, Account> accounts;
    HashMap<Integer, Ticket> tickets;

    public ParkingLotService(String name, int numberOfFloors) {
        this.parkingLot = new ParkingLot(name, numberOfFloors);
        this.accounts = new HashMap<>();
        this.tickets = new HashMap<>();
    }

    public int createUserAccount(String name, String password, String phoneNumber){
        User user = new User(name, password, phoneNumber);
        this.accounts.put(user.getUserId(), user);
        return user.getUserId();
    }

    public int createGuestAccount(String name, String phoneNumber){
        Guest guest = new Guest(name, phoneNumber);
        this.accounts.put(guest.getGuestId(), guest);
        return guest.getGuestId();
    }

    class Ticket{
        int ticketNumber;
        String name;
        String entry;
        String exit;
        String vehicleType;
        String number;  
    }

    public int park(AccountType accountType, int accountNumber, VehicleType vehicleType,
                    String vehicleNumber, VehicleColor color){
        Account account;
        if(accountType == AccountType.GUEST) account = (Guest)this.accounts.get(accountNumber);
        else account = (User)this.accounts.get(accountNumber);
        Vehicle vehicle = new Vehicle(account, vehicleType, vehicleNumber, color);

        return -1;
    }
}
