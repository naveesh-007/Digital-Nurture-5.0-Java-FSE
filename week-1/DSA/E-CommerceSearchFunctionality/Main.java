import model.Product;
import search.LinearSearch;
import search.BinarySearch;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(301, "iPhone", "Mobiles"),
                new Product(302, "MacBook", "Laptops"),
                new Product(303, "AirPods", "Accessories"),
                new Product(304, "iPad", "Tablets"),
                new Product(305, "Apple Watch", "Wearables")
        };

        LinearSearch linear = new LinearSearch();
        BinarySearch binary = new BinarySearch();

        Product p1 = linear.search(products, "MacBook");

        System.out.println("Linear Search Result");

        if (p1 != null) {
            p1.display();
        } else {
            System.out.println("Product Not Found");
        }

        Product p2 = binary.search(products, "ipad");

        System.out.println("\nBinary Search Result");

        if (p2 != null) {
            p2.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}