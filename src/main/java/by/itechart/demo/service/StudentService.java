package by.itechart.demo.service;

import by.itechart.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;


@Service
public class StudentService {

    public Collection<Student> list() {
        Collection<Student> result = new ArrayList<>();

        result.add(createStudent(1, "Иван", "Иванов"));
        result.add(createStudent(2, "Петр", "Петров"));
        result.add(createStudent(3, "Семен", "Семенов"));
        result.add(createStudent(4, "Даша", "Васильева"));
        result.add(createStudent(5, "Глаша", "Василькова"));

        return result;
    }

    private Student createStudent(Integer id, String firstName, String lastName)
    {
        Student result = new Student(id);

        result.setFirstName(firstName);
        result.setLastName(lastName);

        return result;
    }
}
