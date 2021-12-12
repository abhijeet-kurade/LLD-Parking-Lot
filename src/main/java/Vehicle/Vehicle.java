package Vehicle;

import Account.Account;

public class Vehicle {

    Account owner;
    VehicleType vehicleType;
    String vehicleNumber;
    VehicleColor color;


    public Vehicle(Account owner, VehicleType vehicleType, String vehicleNumber, VehicleColor color) {
        this.owner = owner;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.color = color;
    }


    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }



    public VehicleColor getColor() {
        return color;
    }
}
