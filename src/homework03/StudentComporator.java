package homework03;

import java.util.Comparator;

public class StudentComporator implements Comparator<Human> {
    public int compare(Human human, Human anotherHuman) {
        if (human instanceof Student && anotherHuman instanceof Student) {
            Student student = (Student) human;
            Student anotherStudent = (Student) anotherHuman;
            if (student.getAverage() > anotherStudent.getAverage())
                return -1;
            if (student.getAverage() < anotherStudent.getAverage())
                return 1;
            if (student.getLastName().length() > anotherStudent.getLastName().length())
                return -1;
            if (student.getLastName().length() < anotherStudent.getLastName().length())
                return 1;
        }
        return 0; //There need IlligalArgumentException...
    }
}
