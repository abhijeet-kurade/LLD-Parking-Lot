package ParkingLotServicePkg;

import Account.*;
import PakingLot.Floor;
import PakingLot.ParkingLot;
import PakingLot.Spot;
import Ticket.*;
import Vehicle.*;

import java.util.HashMap;
import java.util.List;

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
        this.accounts.put(user.getAccountId(), user);
        return user.getAccountId();
    }

    public int createGuestAccount(String name, String phoneNumber){
        Guest guest = new Guest(name, phoneNumber);
        this.accounts.put(guest.getAccountId(), guest);
        return guest.getAccountId();
    }


    public TicketToUser park(int accountNumber, VehicleType vehicleType, String vehicleNumber, VehicleColor color ){
        return park(AccountType.USER, accountNumber, vehicleType, vehicleNumber, color);
    }

    public TicketToUser park(AccountType accountType, int accountNumber, VehicleType vehicleType, String vehicleNumber, VehicleColor color) {
        Account account;
        if (accountType == AccountType.GUEST) account = (Guest) this.accounts.get(accountNumber);
        else account = (User) this.accounts.get(accountNumber);
        Vehicle vehicle = new Vehicle(account, vehicleType, vehicleNumber, color);
        for (int i = 1; i <= this.parkingLot.getNumberOfFloors(); i++) {
            String floorName = "Floor" + i;
            Floor floor = this.parkingLot.getFloor(floorName);
            if (floor.isFloorFull()) continue;
            int spotNumber = floor.park(vehicle);
            Spot spot = floor.getSpot(spotNumber);
            Ticket ticket = new Ticket(vehicle, floor, spot, account);
            this.tickets.put(ticket.getTicketNumber(), ticket);

            TicketToUser ticketToUser = new TicketToUser(ticket.getTicketNumber(), account.getName(), String.valueOf(account.getAccountId()),
                    ticket.getStart().toString(), vehicleType.toString(), vehicleNumber, color.toString(), floorName, String.valueOf(spotNumber));

            return ticketToUser;
        }

        return null;
    }

    public TicketToUser freeSpot(int ticketNumber){
        Ticket ticket = this.tickets.get(ticketNumber);
        Floor floor = ticket.getFloor();
        floor.freeSpot(ticket.getSpot().getSpotNumber());
        ticket.completeEntry();
        Account account = ticket.getAccount();
        Vehicle vehicle = ticket.getVehicle();
        TicketToUser ticketToUser = new TicketToUser(ticket.getTicketNumber(), account.getName(), String.valueOf(account.getAccountId()),
                ticket.getStart().toString(), ticket.getEnd().toString(),  vehicle.getVehicleType().toString(), vehicle.getVehicleNumber(), vehicle.getColor().toString(), floor.getFloorName(), String.valueOf(ticket.getSpot().getSpotNumber()));

        return ticketToUser;
    }

    public void showParkingLot(){
        HashMap<String, Floor> floors = this.parkingLot.getFloors();
        for(String floorName : floors.keySet()){
            System.out.println(floorName);
            Floor floor = floors.get(floorName);
            List<Spot> spots = floor.getSpots();
            for(Spot spot : spots){
                int spotNumber = spot.getSpotNumber();
                String vehicle = !spot.isEmpty() ? spot.getVehicle().getVehicleNumber() : "Empty";
                System.out.print(spotNumber +" : "+ vehicle + "  ");
            }
            System.out.println();
        }
    }

    public void showParkingLotFloor(String floorName){
        Floor floor = this.parkingLot.getFloor(floorName);
        List<Spot> spots = floor.getSpots();
        System.out.println(floorName);
        for(Spot spot : spots){
            int spotNumber = spot.getSpotNumber();
            String vehicle = !spot.isEmpty() ? spot.getVehicle().getVehicleNumber() : "Empty";
            System.out.print(spotNumber +" : "+ vehicle + "  ");
        }
        System.out.println();
    }

}
