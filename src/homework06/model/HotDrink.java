package homework06.model;

import java.util.Map;

public class HotDrink extends Product {
    private Integer temperature;
    private Double volume;

    public HotDrink(Map<String, Object> productData) {
        super(productData);
        this.temperature = (Integer) productData.get("temperature");
        this.volume = (Double) productData.get("volume");

    }

    public Integer getTemperature() {
        return temperature;
    }

    public Double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return String.format("%s temperature: %d volume: %.2f", super.toString(), temperature, volume);
    }

    @Override
    public boolean isMatch(Map<String, Object> matchPattern) {
        boolean matchBySuper = super.isMatch(matchPattern);
        boolean matchByVolume = !matchPattern.containsKey("volume") || matchPattern.containsKey("volume")
                && (matchPattern.get("volume") instanceof Double)
                && ((Double) matchPattern.get("volume")).equals(volume);
        boolean matchByTemperature = !matchPattern.containsKey("temperature") || matchPattern.containsKey("temperature")
                && (matchPattern.get("temperature") instanceof Integer)
                && ((Integer) matchPattern.get("temperature")).equals(temperature);

        return matchByTemperature && matchByVolume && matchBySuper;
    }

}
