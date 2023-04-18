package homework06.model;

import java.util.Map;

public abstract class Product {
    private String name;
    private Integer cost;

    public Product(Map<String, Object> productData) {
        this.name = (String) productData.get("name");
        this.cost = (Integer) productData.get("cost");
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public String toString() {
        return String.format("Product name: %s price: %d ", name, cost);
    }

    public boolean isMatch(Map<String, Object> matchPattern) {
        boolean matchByCost = !matchPattern.containsKey("cost") || matchPattern.containsKey("cost")
                && (matchPattern.get("cost") instanceof Integer) && ((Integer) matchPattern.get("cost")).equals(cost);
        boolean matchByName = !matchPattern.containsKey("name") || matchPattern.containsKey("name")
                && (matchPattern.get("name") instanceof String) && ((String) matchPattern.get("name")).equals(name);

        return matchByCost && matchByName;
    }
}
