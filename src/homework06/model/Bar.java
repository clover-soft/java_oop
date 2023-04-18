package homework06.model;

import java.util.Map;

public class Bar extends Product {
    private Double weight;

    public Bar(Map<String, Object> productData) {
        super(productData);
        this.weight = (Double) productData.get("weight");
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s weight: %.2f", super.toString(), this.weight);
    }

    @Override
    public boolean isMatch(Map<String, Object> matchPattern) {
        boolean matchBySuper = super.isMatch(matchPattern);
        boolean matchByWeight = !matchPattern.containsKey("weight") || matchPattern.containsKey("weight")
                && (matchPattern.get("weight") instanceof Double)
                && ((Double) matchPattern.get("weight")).equals(weight);
        return matchBySuper && matchByWeight;
    }

}
