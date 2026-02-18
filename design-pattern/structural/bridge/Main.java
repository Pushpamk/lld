class Main {
    public static void main(String[] args) {
        Car petrolSuv = new SuvCar(new PetrolEngine());
        petrolSuv.drive();

        Car dieselSedan = new SedanCar(new DieselEngine());
        dieselSedan.drive();
    }
}