package lesson02;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MakeBehaviour {
    private List<Actor> actors = new ArrayList<>();
    private Queue<Actor> actorQueue = new ArrayDeque<>();

    public void takeInQueue(Actor actor) {
        actorQueue.add(actor);
    }

    public void takeOrders() {
        Actor actor = actorQueue.peek();
        if (actor instanceof Human) {
            ((Human) actor).setMakeOrder();
        }
    }

    public void giveOrders() {
        Actor actor = actorQueue.peek();
        if (actor instanceof Human) {
            ((Human) actor).setTakeOrder();
        }

    }

    public void releaseFromQueue() {
        actorQueue.poll();
    }

    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }

    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
    }
    public void update() {

    }
}
