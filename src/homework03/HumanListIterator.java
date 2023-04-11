package homework03;

import java.util.Iterator;
import java.util.List;

public class HumanListIterator implements Iterator<Human> {
    private int counter;
    private List<Human> itemList;

    public HumanListIterator(List<Human> itemList) {
        this.counter = 0;
        this.itemList = itemList;
    }

    @Override
    public boolean hasNext() {
        return counter < itemList.size();
    }

    @Override
    public Human next() {
        if (!hasNext()) {
            return null;
        }
        return itemList.get(counter++);
    }
}
