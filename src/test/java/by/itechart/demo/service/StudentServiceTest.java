package by.itechart.demo.service;

import by.itechart.demo.model.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

import static org.junit.Assert.*;

public class StudentServiceTest {
    @Autowired
    StudentService studentService;

    @Test
    public void list() throws Exception {
        Collection<Student> students = studentService.list(0, 5);

        assertNotNull(students);
        assertEquals(students.size() > 0, Boolean.TRUE);

    }

}