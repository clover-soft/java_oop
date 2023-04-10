package lesson03;

public class Student {
    private String name;
    private String lastName;
    private Integer groupId;
    private Integer average;

    Student(String name, String lastName, Integer groupId, Integer average) {
        this.name = name;
        this.lastName = lastName;
        this.groupId = groupId;
        this.average = average;

    }

    public String toString() {
        return String.format("Average: %d Name:%s LastName %s GroupId:%d", average, name, lastName, groupId);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Integer getAverage() {
        return average;
    }
}