package homework05.model;

public class User {
    private String name;
    private int age;
    private int balance;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return this.balance;
    }

    public void payment(int amount) {
        this.balance += amount;
    }

    public int withdrawal(int amount) {
        amount = amount > this.balance ? this.balance : amount;
        this.balance -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
