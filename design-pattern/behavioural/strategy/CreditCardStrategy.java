public class CreditCardStrategy implements PaymentStrategy {
    private int ccNumber;

    CreditCardStrategy(int ccNumber) {
        this.ccNumber = ccNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " amount payed by Credit Card");
    }
}