package search;

import model.Product;

public class LinearSearch {

    public Product search(Product[] products, String key) {

        for (int i = 0; i < products.length; i++) {

            if (products[i].name.equalsIgnoreCase(key)) {
                return products[i];
            }
        }

        return null;
    }
}