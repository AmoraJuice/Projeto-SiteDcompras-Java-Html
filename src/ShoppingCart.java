import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }
    public void addItem(Product product) {
        items.add(product);
    }
    public void removeItem(Product item) {
        items.remove(product);
    }
    public List<Product> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0.0;
            for (Product product : items) {
                total += product.getPrice();
            }
            return total;
    }
}
