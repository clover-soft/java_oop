package homework04;

public class Homework {
    // Создать наследника реализованного класса ГорячийНапиток с дополнительным
    // полем int температура.
    // Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
    // реализовать
    // перегруженный метод getProduct(int name, int volume, int temperature)
    // выдающий продукт соответствующий имени, объему и температуре
    // В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
    // и воспроизвести логику заложенную в программе
    // Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

    // Необходимо взять код из первого дз и переработать его с учетом обобщений
    // т.е избавиться от классов под каждый тип продукта, заменив единым классом -
    // торговым автоматом

    public static void main(String[] args) throws Exception {
        System.out.println("Hot drinks:");
        VendingMachine<HotDrink> m = new VendingMachine<>();
        m.addProduct(new HotDrink("Black tea", 110, 80, 0.3));
        m.addProduct(new HotDrink("Green tea", 110, 80, 0.3));
        m.addProduct(new HotDrink("Cappucino", 200, 65, 0.35));
        m.addProduct(new HotDrink("Americano", 150, 75, 0.25));
        m.addProduct(new HotDrink("Espresso", 150, 80, 0.15));
        m.addProduct(new HotDrink("Match drink", 350, 60, 0.35));
        for (HotDrink product : m.getProducts()) {
            System.out.println(product);
        }
        System.out.println();
        System.out.println(m.getProduct(350));
        System.out.println(m.getProduct("Green tea"));
        System.out.println("\nBars:");
        VendingMachine<Bar> m2 = new VendingMachine<>();
        m2.addProduct(new Bar("Snickers", 40, 0.06));
        m2.addProduct(new Bar("Mars", 40, 0.07));
        m2.addProduct(new Bar("Baunty", 40, 0.07));
        m2.addProduct(new Bar("Twix", 40, 0.045));
        for (Bar product : m2.getProducts()) {
            System.out.println(product);
        }
    }
}
