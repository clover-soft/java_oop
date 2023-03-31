package homework01;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements VendingMachine {
    private List<HotDrink> products = new ArrayList<HotDrink>();

    public List<HotDrink> getProducts() {
        return products;
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName() == name) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByCost(Integer cost) {
        for (Product product : products) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (product instanceof HotDrink)
            products.add((HotDrink) product);
    }

    HotDrink getProduct(Integer temperature) {
        for (HotDrink product : products) {
            if (temperature.equals(product.getTemperature()))
                return (HotDrink) product;
        }
        return null;
    }

    HotDrink getProduct(String name) {
        for (HotDrink product : products) {
            if (name.equals(product.getName())) {
                return (HotDrink) product;
            }
        }
        return null;
    }

    HotDrink getProduct(Double volume) {
        for (HotDrink product : products) {
            if (volume.equals(product.getVolume()))
                return (HotDrink) product;
        }
        return null;
    }

}
