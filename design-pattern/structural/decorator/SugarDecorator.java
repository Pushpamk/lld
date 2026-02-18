public class SugarDecorator extends CoffeeDecorator {
    SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDestription() {
        return coffee.getDestription() + " + sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 2.5;
    }
}