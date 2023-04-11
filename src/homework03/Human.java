package homework03;

public class Human {
    protected String name;
    protected String lastName;

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return String.format("Name:%s LastName %s", name, lastName);
    }

}
