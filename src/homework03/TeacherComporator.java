package homework03;

import java.util.Comparator;

public class TeacherComporator implements Comparator<Human> {
    public int compare(Human human, Human anotherHuman) {
        if (human instanceof Teacher && anotherHuman instanceof Teacher) {
            Teacher teacher = (Teacher) human;
            Teacher anotherTeacher = (Teacher) anotherHuman;
            return teacher.getStudentGroupSet().size() > anotherTeacher.getStudentGroupSet().size() ? -1
                    : (teacher.getStudentGroupSet().size() < anotherTeacher.getStudentGroupSet().size() ? 1 : 0);
        }
        return 0; //There need IlligalArgumentException...
    }
}
