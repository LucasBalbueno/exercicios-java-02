public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product (String name, double price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName () {
        return name;
    }

    public void setName (String nameProduct) {
        this.name = nameProduct;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        if (price <= 0) {
            System.out.println("Is not possible set price lower than 0");
        } else {
            this.price = price;
        }
    }

    public int getQuantity () {
        return quantity;
    }

    public void setQuantity (int quantity) {
        if (quantity <= 0) {
            System.out.println("Is not possible set price lower than 0");
        } else {
            this.quantity = quantity;
        }
    }

    public void showProduct () {
        System.out.println("Product name: " + name);
        System.out.println("Product price: R$" + price);
        System.out.println("Product quantity: " + quantity);
    }
}
