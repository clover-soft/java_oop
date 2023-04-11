package homework03;

import java.util.HashSet;
import java.util.Set;

public class Teacher extends Human {
    private Set<StudentGroup> studentGroupList = new HashSet<>();

    public Teacher(String name, String lastName) {
        super(name, lastName);
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroupList.add(studentGroup);
    }

    public void removeStudentGroup(StudentGroup studentGroup) {
        studentGroupList.remove(studentGroup);

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<StudentGroup> getStudentGroupSet() {
        return studentGroupList;
    }

    public String toString() {
        return String.format("%s , groupListSize: %d", super.toString(), studentGroupList.size());
    }

}
