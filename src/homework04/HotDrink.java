package homework04;

public class HotDrink extends Product {
    private Integer temperature;
    private Double volume;

    public HotDrink(String name, Integer cost, Integer temperature, Double volume) {
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;

    }

    public Integer getTemperature() {
        return temperature;
    }

    public Double getVolume() {
        return volume;
    }

    public String toString() {
        return String.format("%s temperature: %d volume: %.2f", super.toString(), temperature, volume);
    }
}
