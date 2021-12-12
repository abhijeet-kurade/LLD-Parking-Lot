import Account.AccountType;
import ParkingLotServicePkg.*;
import Ticket.TicketToUser;
import Vehicle.VehicleColor;
import Vehicle.VehicleType;

public class MainClass {
    public static void main(String[] args) {
        testCase2();
    }

    public static void testCase1(){
        ParkingLotService parkingLot = new ParkingLotService("Parking Lot", 3);

        int guest1 = parkingLot.createGuestAccount("Abhijeet", "9970188701");
        int guest2 = parkingLot.createGuestAccount("Guru", "8956482570");
        int guest3 = parkingLot.createGuestAccount("Amit", "967845125784");
        int guest4 = parkingLot.createGuestAccount("Mayur", "6893454455");
        int guest5 = parkingLot.createGuestAccount("Dipali", "785496857302");
        int guest6 = parkingLot.createGuestAccount("Nilesh", "985478415260");
        int guest7 = parkingLot.createGuestAccount("Prasad", "784598657845");
        int guest8 = parkingLot.createGuestAccount("Diya", "9836020115");
        int guest9 = parkingLot.createGuestAccount("Prachi", "8578459868");
        int guest10 = parkingLot.createGuestAccount("Akash", "918765001200");
        int guest11 = parkingLot.createGuestAccount("Nimish", "8578459868");
        int guest12 = parkingLot.createGuestAccount("Rohit", "8579794532");
        int guest13 = parkingLot.createGuestAccount("Roshni", "998744872254");
        int guest14 = parkingLot.createGuestAccount("Kalyani", "962525140401");

        TicketToUser guest1Ticket = parkingLot.park(AccountType.GUEST, guest1, VehicleType.CAR, "MH1-5213", VehicleColor.BLACK);
        TicketToUser guest2Ticket = parkingLot.park(AccountType.GUEST, guest2, VehicleType.CAR, "MH1-9832", VehicleColor.BLUE);
        TicketToUser guest3Ticket = parkingLot.park(AccountType.GUEST, guest3, VehicleType.CAR, "MH1-4586", VehicleColor.BLUE);
        TicketToUser guest4Ticket = parkingLot.park(AccountType.GUEST, guest4, VehicleType.CAR, "MH1-4008", VehicleColor.BLUE);
        TicketToUser guest5Ticket = parkingLot.park(AccountType.GUEST, guest5, VehicleType.CAR, "MH1-8740", VehicleColor.BLUE);
        TicketToUser guest6Ticket = parkingLot.park(AccountType.GUEST, guest6, VehicleType.CAR, "MH1-3694", VehicleColor.BLUE);
        TicketToUser guest7Ticket = parkingLot.park(AccountType.GUEST, guest7, VehicleType.CAR, "MH1-2045", VehicleColor.BLUE);
        TicketToUser guest8Ticket = parkingLot.park(AccountType.GUEST, guest8, VehicleType.CAR, "MH1-0404", VehicleColor.BLUE);

        parkingLot.freeSpot(guest3Ticket.getTicketNumber());
        parkingLot.freeSpot(guest4Ticket.getTicketNumber());
        TicketToUser guest9Ticket = parkingLot.park(AccountType.GUEST, guest9, VehicleType.CAR, "MH1-9800", VehicleColor.BLUE);

        parkingLot.showParkingLot();

    }

    public static void testCase2() {
        ParkingLotService parkingLot = new ParkingLotService("Parking Lot", 3);
        //int guest1 = parkingLot.createGuestAccount("Abhijeet", "9970188701");
        int user1 = parkingLot.createUserAccount("Abhijeet","12345", "9970188701");
        TicketToUser guest1Ticket = parkingLot.park(user1, VehicleType.CAR, "MH1-5213", VehicleColor.BLACK);
        parkingLot.showParkingLot();
    }
}
