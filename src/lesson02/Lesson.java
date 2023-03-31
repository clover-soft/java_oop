package lesson02;

public class Lesson {

        public static void main(String[] args) {
            Human human = new Human();
            human.setName("Kate");
            human.setMakeOrder();
            human.setTakeOrder();
            System.out.println(human.isMakeOrder());
            System.out.println(human.isTakeOrder());
            System.out.println(human.getName());
            Market market = new Market();
            market.takeInQueue(human);
            market.takeOrders();
            market.giveOrders();
            market.releaseFromQueue();
            market.acceptToMarket(human);
            market.releaseFromMarket(human);
        }
        
}
