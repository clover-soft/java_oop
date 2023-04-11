package homework04;

public class Bar extends Product {
    private Double weight;

    public Bar(String name, Integer cost, Double weight) {
        super(name, cost);
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public String toString() {
        return String.format("%s weight: %.2f", super.toString(), weight);
    }
}
