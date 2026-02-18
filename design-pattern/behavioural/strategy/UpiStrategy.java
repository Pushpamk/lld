public class UpiStrategy implements PaymentStrategy {
    private String upiId;

    UpiStrategy(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " amount payed by UPI");
    }
}