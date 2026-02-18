public class SuvCar extends Car {
    SuvCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving Suv Car");
    }
}