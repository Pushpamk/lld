public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}