public class Boleto extends PaymentMethod{
    private String KeyBoleto;

    public Boleto (String keyBoleto) {
        this.KeyBoleto = keyBoleto;
    }

    @Override
    public boolean validatePayment () {
        boolean isValidate = false;
        if (KeyBoleto.isEmpty()) {
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