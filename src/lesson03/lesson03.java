package lesson03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// - Создать класс Студент
// - Создать класс УчебнаяГруппаИтератор
// - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
// - Реализовать его контракты (включая удаление)

// - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
// - Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)

public class lesson03 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", "Петров", 1, 5));
        students.add(new Student("Василий", "Соловьев", 1, 4));
        students.add(new Student("Михаил", "Марков", 2, 5));
        students.add(new Student("Екатерина", "Ветрова", 1, 3));
        students.add(new Student("Владислав", "Листьев", 2, 2));
        students.add(new Student("Мария", "Петрова", 1, 5));

        Collections.sort(students, new StudentComporator());
        StudentsGroupIterator group = new StudentsGroupIterator(students);
        while (group.hasNext()) {
            System.out.println(group.next());
        }

    }
}
