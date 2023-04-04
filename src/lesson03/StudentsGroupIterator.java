package lesson03;

import java.util.Iterator;
import java.util.List;

public class StudentsGroupIterator implements Iterator<Student> {
    private int counter;
    private List<Student> students;

    public StudentsGroupIterator(List<Student> students) {
        this.counter = 0;
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return students.get(counter++);
    }
}
