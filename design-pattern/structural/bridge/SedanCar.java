public class SedanCar extends Car {
    SedanCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving sedan car");
    }
}