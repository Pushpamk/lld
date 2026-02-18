package factory;

class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType) {
        if (vehicleType == VehicleType.CAR)
            return new Car();
        else if (vehicleType == VehicleType.BIKE)
            return new Bike();
        else
            throw new RuntimeException("Vehicle Type cant be empty");
    }
}