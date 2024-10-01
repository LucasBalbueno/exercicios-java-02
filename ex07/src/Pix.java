public class Pix extends PaymentMethod {
    private String PixKey;

    public Pix (String pixKey) {
        this.PixKey = pixKey;
    }

    @Override
    public boolean validatePayment () {
        boolean isValidate = false;
        if (PixKey.isEmpty()) {
            isValidate = false;
        } else {
            isValidate = true;
        }

        return isValidate;
    }

    @Override
    public void processPayment (double value) {
        if (validatePayment()) {
            System.out.println("Payment processed!");
        } else {
            System.out.println("Payment denied!");
        }
    }
}