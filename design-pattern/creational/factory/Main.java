package factory;
class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle(VehicleType.CAR);
        System.out.print(car.getClass().getName());
    }
}