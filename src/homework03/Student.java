package homework03;

public class Student extends Human {
    private Integer average;

    Student(String name, String lastName, Integer average) {
        super(name, lastName);
        this.average = average;

    }

    public String toString() {
        return String.format("Average: %d  %s", average, super.toString());
    }

    public Integer getAverage() {
        return average;
    }
}