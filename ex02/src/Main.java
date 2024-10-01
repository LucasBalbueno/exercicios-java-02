public class Main {
    public static void main(String[] args) {
        Validation shoesOff = new Validation("Blue Shoes", 259.90, 2, 10);

        shoesOff.showProduct();

        System.out.println(shoesOff.getDiscount());

        shoesOff.setDiscount(50);

        shoesOff.showProduct();
        System.out.println(shoesOff.getDiscount());
    }
}