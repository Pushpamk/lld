package factory;
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.print("Car is starting");
    }
}