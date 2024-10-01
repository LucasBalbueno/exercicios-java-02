public class Validation extends Product{
    private double discount;

    public Validation(String name, double price, int quantity, double discount) {
        super(name, price, quantity);
        setDiscount(discount);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount (double percentage) {
        if (percentage <= 0 || percentage > 50) {
            System.out.println("The discount percentage must be between 0% and 50%");
        } else {
            double price = getPrice();
            double discount = percentage / 100;
            int value = (int) (price * discount);
            double newPrice = Double.parseDouble(String.format("%.2f", price - value));
            this.discount = newPrice;
        }
    }
}