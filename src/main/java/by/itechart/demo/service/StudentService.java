package by.itechart.demo.service;

import by.itechart.demo.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class StudentService {

    private static final List<Student> students = new ArrayList<>();

    @PostConstruct
    private void init() {
        if (students.isEmpty()) {
            students.add(createStudent(1, "Иван", "Иванов"));
            students.add(createStudent(2, "Петр", "Петров"));
            students.add(createStudent(3, "Семен", "Семенов"));
            students.add(createStudent(4, "Даша", "Васильева"));
            students.add(createStudent(5, "Глаша", "Василькова"));
            students.add(createStudent(6, "Dan", "Poland"));
            students.add(createStudent(7, "John", "USA"));
            students.add(createStudent(8, "Sam", "England"));
            students.add(createStudent(9, "Petr", "Russian"));
            students.add(createStudent(10, "Simon", "Simonov"));

            students.add(createStudent(11, "Дмитрий", "Безрукий"));
            students.add(createStudent(12, "Григорий", "Беспалый"));
            students.add(createStudent(13, "Марат", "Белый"));

        }
    }

    public Collection<Student> list(int offset, int limit) {
        return students.subList(offset, offset + limit);
    }

    public Integer getCount() {
        return students.size();
    }

    public Student get(int id) {
        if (id >= 0 && id <= students.size()) {
            return students.get(id);
        }

        return null;
    }


    private Student createStudent(Integer id, String firstName, String lastName)
    {
        Student result = new Student(id);

        result.setFirstName(firstName);
        result.setLastName(lastName);

        return result;
    }
}
