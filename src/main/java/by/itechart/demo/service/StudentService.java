package by.itechart.demo.service;

import by.itechart.demo.dao.StudentRepository;
import by.itechart.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;


@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public Collection<Student> list() {
        Collection<Student> result = new ArrayList<>();

        Iterable<by.itechart.demo.entity.Student> students = studentRepository.findAll();

        for (by.itechart.demo.entity.Student student: students)
        {
            result.add(transformStudent(student));
        }

        return result;
    }

    private Student transformStudent(by.itechart.demo.entity.Student source)
    {
        Student result = new Student(source.getId());

        result.setFirstName(source.getFirstName());
        result.setLastName(source.getLastName());

        if (source.getDateOfBirth() != null) {
            result.setDateOfBirth(source.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }

        return result;
    }
}
