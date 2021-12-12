package Ticket;

public class TicketToUser{
    int ticketNumber;
    String name;
    String accountId;
    String entry;
    String exit;
    String vehicleType;
    String number;
    String color;
    String floor;
    String spot;

    public TicketToUser(int ticketNumber, String name, String accountId, String entry, String vehicleType, String number, String color, String floor, String spot) {
        this.ticketNumber = ticketNumber;
        this.name = name;
        this.accountId = accountId;
        this.entry = entry;
        this.vehicleType = vehicleType;
        this.number = number;
        this.color = color;
        this.floor = floor;
        this.spot = spot;
    }

    public TicketToUser(int ticketNumber, String name, String accountId, String entry, String exit, String vehicleType, String number, String color, String floor, String spot) {
        this.ticketNumber = ticketNumber;
        this.name = name;
        this.accountId = accountId;
        this.entry = entry;
        this.exit = exit;
        this.vehicleType = vehicleType;
        this.number = number;
        this.color = color;
        this.floor = floor;
        this.spot = spot;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public String toString() {
        return "TicketToUser{" +
                "Ticket Number=" + ticketNumber +
                ", Name='" + name + '\'' +
                ", Account='" + accountId + '\'' +
                ", Entry='" + entry + '\'' +
                ", Exit='" + exit + '\'' +
                ", Vehicle Type='" + vehicleType + '\'' +
                ", Number ='" + number + '\'' +
                ", Color='" + color + '\'' +
                ", Floor='" + floor + '\'' +
                ", Spot Number='" + spot + '\'' +
                '}';
    }

}