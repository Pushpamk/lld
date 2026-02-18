class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new UpiStrategy("pushpam@ybl"));
        paymentContext.pay(1000);
    
        paymentContext.setPaymentStrategy(new CreditCardStrategy(1234567889));
        paymentContext.pay(399);
    }
}