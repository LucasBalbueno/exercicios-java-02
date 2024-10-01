public class Main {
    public static void main(String[] args) {
        PaymentMethod systemPayment1 = new CreditCard("Lucas", "123456789", "321");
        PaymentMethod systemPayment2 = new Pix("balbuenolucas04@gmail.com");
        PaymentMethod systemPayment3 = new Boleto("987654321");

        systemPayment1.processPayment(1700);
        systemPayment2.processPayment(200);
        systemPayment3.processPayment(869);
    }
}