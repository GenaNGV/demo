package by.itechart.demo.service;

import by.itechart.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class StudentService {

    public Collection<Student> list(int offset, int limit) {
        List<Student> result = new ArrayList<>();

        result.add(createStudent(1, "Иван", "Иванов"));
        result.add(createStudent(2, "Петр", "Петров"));
        result.add(createStudent(3, "Семен", "Семенов"));
        result.add(createStudent(4, "Даша", "Васильева"));
        result.add(createStudent(5, "Глаша", "Василькова"));
        result.add(createStudent(6, "Dan", "Poland"));
        result.add(createStudent(7, "John", "USA"));
        result.add(createStudent(8, "Sam", "England"));
        result.add(createStudent(9, "Petr", "Russian"));
        result.add(createStudent(10, "Simon", "Simonov"));

        return result.subList(offset, offset + limit);
    }

    public Integer getCount() {
        return 10;
    }


    private Student createStudent(Integer id, String firstName, String lastName)
    {
        Student result = new Student(id);

        result.setFirstName(firstName);
        result.setLastName(lastName);

        return result;
    }
}
