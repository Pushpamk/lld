public class MilkDecorator extends CoffeeDecorator {
    MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDestription() {
        return coffee.getDestription() + " + milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 8;
    }
}