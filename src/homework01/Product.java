package homework01;

public abstract class Product {
    private String name;
    private Integer cost;

    public Product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
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
}
