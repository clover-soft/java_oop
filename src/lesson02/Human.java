package lesson02;

public class Human extends Actor {

    public void setName(String name) {
        this.name = name;
    }

    public void setMakeOrder() {
        isMakeOrder = true;
        
    }

    public void setTakeOrder() {
        isTakeOrder = true;
    }

    public String getName() {
        return name;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;

    }

    public boolean isTakeOrder() {
        return isTakeOrder;

    }    
}
