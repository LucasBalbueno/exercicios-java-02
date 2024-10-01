public abstract class PaymentMethod {
    public abstract void processPayment (double value);
    public abstract boolean validatePayment ();
}