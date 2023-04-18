package homework06.view;

import java.util.Map;

import homework06.controller.VendingMachineController;

// Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, 
// усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему

/*
 * В процессе выполнения домашнего задания я постарался использовать в принцип SOLID в полной мере
 * Основной моей задачей было продемонстрировать как можно реализовать поставленную задачу таким образом, что бы дальнейшая
 * разработка была максимально простой, код читался легко, а функционал работал так как нам нужно.
 * 
 * Задача: Реализовать ПродуктовыйАвтомат, который будет продавать два типа продуктов.
 * 
 * Архитектурные слои:
 * 1) View ни чего не занет о том что у нас под капотом, имеет доступ только к контроллеру авттомата,
 *    может добавлять продукты, получать прайс лист, находить нужные продукты через контроллер
 * 2) Контроллер, ни чего не знает о классах продктов, его задача предоставить досутп для View к сервису
 * 3) Сервис отвечает только за работу с репозиторием и с конкертными типами продкутов
 * 4) Модель имеет абстрактный класс Product и наследников HotDrink и Bar
 * 5) Репозиторий - статический List<Product>
 * 
 * Что пришлось переделать в исходном коде семинара №4, так как мы придерживаемся принципа SOLID при проектировании данного приложения
 * пришлось переделать исходный код полностью, так как он не подлежал рефакторингу, так как нужно было изменить не только структуру,
 * но и саму реализацию методов, так как они не соответствовали принципам SOLID
 * 
 * S - Принцип единственной ответвтенности: разделил ответственность между классами Контроллер работает с View и Серивсами, 
 *     Сервисы работают  с репозиторием и типами продуктов (класса HotDrink,Bar). Классы HotDrink и Bar наследники от Product
 *     отвечают только за собственную сущность, репозиторий только хранит список
 * O - Принцип открытости-закрытости: Классы HotDrink и Bar наследуют от Product таким образом мы получаем возможность добавлять типы
 *     продуктов, не модифицируя сами типы продуктов, а так же расширять классы наследники от Product без изменения текущей реализации
 * L - Принцип подстановки Барбары Лисков: здесь реализовал логику поиска продукта по параметрам, для суперклааса и для наследников
 *     таким образом появилась возможность искать продукт по различным параметрам, и при этом за поиск продукта отвечает логика
 *     реализованная в самом классе продукта, что позволит удобно добавить еще один тип продукта со своим поиском и не модифицируя
 *     уже реализованные механизимы поиска
 * I - Принцип разделения интерфейса: так как у нас один простой сервис, нам потребовался всего один простой интерфейс
 * D - Принцип инверсии зависимостей: Вот тут хочу обратить внимание на то, что реализацию выполнил таким образом, что бы связность
 *     архитектурных слоев была минимальна, при этом можно добавлять функционал на различном уровне без необходимости внесения изменений
 *     в другой уровень абстракции. Например: View ни чего не знает о том что у нас есть классы HotDrink и Bar, этот слой не зависит от этих
 *     классов, он оперирует только с текстовыми сущностями. Контроллер так же не знает про эти классы, его задача это
 *     взаимодействие между сервисом и View, тоже самое можно сказать про Сервис(VendingMachineImpl) оне ни чего не знает про View,Contoller и
 *     даже не знает про абстрактный класс Product, ему нужны для работы только HotDrink Bar и репозиторий.
 *
 */

public class View {
    public static void main(String[] args) {
        VendingMachineController vMachineController = new VendingMachineController();
        vMachineController.addProduct("Bar", Map.of("name", "snikers", "cost", 50, "weight", 0.08));
        vMachineController.addProduct("Bar", Map.of("name", "bounty", "cost", 55, "weight", 0.06));
        vMachineController.addProduct("Bar", Map.of("name", "mars", "cost", 45, "weight", 0.08));
        vMachineController.addProduct("Bar", Map.of("name", "twix", "cost", 40, "weight", 0.05));
        vMachineController.addProduct("Bar", Map.of("name", "kit-cat", "cost", 35, "weight", 0.04));
        vMachineController.addProduct("Bar", Map.of("name", "nuts", "cost", 50, "weight", 0.07));
        vMachineController.addProduct("HotDrink",
                Map.of("name", "Green tea", "cost", 90, "volume", 0.22, "temperature", 70));
        vMachineController.addProduct("HotDrink",
                Map.of("name", "Black tea", "cost", 90, "volume", 0.22, "temperature", 80));

        for (String priceItem : vMachineController.getPpriceList()) {
            System.out.println(priceItem);

        }
        System.out.println(vMachineController.getProductByMatchPattern(Map.of("cost", 50)));

    }
}
