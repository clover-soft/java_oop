package homework03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// К коду с семинара добаить класс Teacher и возможность итерации и компорации для него. 
// Так же для учебной группы добавить преподавателя(У группы может быть только один преподаватель, у проподавателя сколько угодно групп)

public class Homework03 {
    public static void main(String[] args) {

        Teacher teacher01 = new Teacher("Teacher1", "LName1");
        Teacher teacher02 = new Teacher("Teacher2", "LName2");
        Teacher teacher03 = new Teacher("Teacher3", "LName3");
        Teacher teacher04 = new Teacher("Teacher4", "LName4");

        StudentGroup StudentGroup01 = new StudentGroup("Group01", 0, teacher01);
        StudentGroup StudentGroup02 = new StudentGroup("Group02", 1, teacher02);
        StudentGroup StudentGroup03 = new StudentGroup("Group03", 2, teacher03);
        StudentGroup StudentGroup04 = new StudentGroup("Group04", 3, teacher04);
        StudentGroup StudentGroup05 = new StudentGroup("Group05", 4, teacher04);
        StudentGroup StudentGroup06 = new StudentGroup("Group06", 5, teacher04);
        StudentGroup StudentGroup07 = new StudentGroup("Group07", 6, teacher03);

        List<Human> students = new ArrayList<Human>();
        students.add(new Student("Алексей", "Петров", 5));
        students.add(new Student("Василий", "Соловьев", 4));
        students.add(new Student("Михаил", "Марков", 5));
        students.add(new Student("Екатерина", "Ветрова", 3));
        students.add(new Student("Владислав", "Листьев", 2));
        students.add(new Student("Мария", "Петрова", 5));

        Collections.sort(students, new StudentComporator());
        HumanListIterator studentListIter = new HumanListIterator(students);
        while (studentListIter.hasNext()) {
            System.out.println(studentListIter.next());
        }

        List<Human> teacherList = new ArrayList<Human>();
        teacherList.add(teacher01);
        teacherList.add(teacher02);
        teacherList.add(teacher03);
        teacherList.add(teacher04);
        
        Collections.sort(teacherList, new TeacherComporator());
        HumanListIterator teacherListIter = new HumanListIterator(teacherList);
        while (teacherListIter.hasNext()) {
            System.out.println(teacherListIter.next());
        }
    }
}
