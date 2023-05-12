public class Product {

    public static void main(String[] args) {
        // create a new product with a cost of $4, a quantity of 10, and a name of "Gallon" per example
        Product product = new Product(4, 10, "Gallon");

        // call the printProduct method to print the product details
        product.printProduct();

        // call the totalCost method to print the total cost of purchasing the product
        product.totalCost();
    }
    private double cost;
    private int quantity;
    private String name;

    public Product(double cost, int quantity, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    public void totalCost() {
        System.out.println("Total cost: $" + (cost * quantity));
    }

    public void printProduct() {
        System.out.println(name + " costs " + cost + " and " + quantity + " units were purchased");
    }
}
