package homework06.service;

import java.util.List;
import java.util.Map;

public interface VendingMachine {
    List<String> getProductPriceList();

    void addProduct(String productType, Map<String, Object> productData);

    List<String> getProducts(Map<String, Object> matchPattern);

    List<String> getProductTypes();
}
