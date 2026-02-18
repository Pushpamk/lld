public class BasicCoffee implements Coffee {
    @Override
    public String getDestription() {
        return "Basic coffee";
    }

    @Override
    public double cost() {
        return 10;
    }
}