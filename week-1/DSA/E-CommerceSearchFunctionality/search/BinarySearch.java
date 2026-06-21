package search;

import java.util.Arrays;
import model.Product;

public class BinarySearch {

    public Product search(Product[] products, String key) {

        Arrays.sort(products,
                (p1, p2) -> p1.name.compareToIgnoreCase(p2.name));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int result = products[mid].name.compareToIgnoreCase(key);

            if (result == 0) {
                return products[mid];
            }

            if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}