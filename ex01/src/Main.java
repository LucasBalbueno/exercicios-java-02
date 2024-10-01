public class Main {
    public static void main(String[] args) {
        Product jacket = new Product("Blue Jacket", 199.79, 2);

        jacket.showProduct();

        jacket.setName("Jacket yellow");

        System.out.println(jacket.getName());

        jacket.setPrice(499);

        System.out.println(jacket.getPrice());

        jacket.setQuantity(5);

        System.out.println(jacket.getQuantity());

        jacket.showProduct();

        System.out.println("=========================");

        jacket.setPrice(-122);

        jacket.setQuantity(-2);

        jacket.showProduct();
    }
}