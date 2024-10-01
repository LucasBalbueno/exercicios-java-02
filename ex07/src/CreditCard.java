public class CreditCard extends PaymentMethod {
    private String Name;
    private String NumberCard;
    private String CvvCard;

    public CreditCard(String name, String numberCard, String cvvCard) {
        this.Name = name;
        this.NumberCard = numberCard;
        this.CvvCard = cvvCard;
    }

    @Override
    public boolean validatePayment () {
        boolean isValidate = false;
        if (Name.isEmpty() || NumberCard.isEmpty() || CvvCard.isEmpty()) {
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