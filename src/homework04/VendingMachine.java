package homework04;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T extends Product> {
    private List<T> products= new ArrayList<>();

    public List<T> getProducts() {
        return products;
    }

    public Product getProductByName(String name) {
        for (T product : products) {
            if (product.getName() == name) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByCost(Integer cost) {
        for (T product : products) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(T product) {
        products.add(product);
    }

    T getProduct(String name) {
        for (T product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    T getProduct(String name, Integer cost) {
        for (T product : products) {
            if (product.getName().equals(name) && product.getCost().equals(cost)) {
                return  product;
            }
        }
        return null;
    }
    T getProduct(Integer cost) {
        for (T product : products) {
            if (product.getCost().equals(cost)) {
                return  product;
            }
        }
        return null;
    }

}
