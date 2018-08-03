package by.itechart.demo.controller;

import by.itechart.demo.model.Student;
import by.itechart.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class DataController {
    @Autowired
    StudentService studentservice;

    @RequestMapping("/students")
    public Collection<Student> students(@RequestParam(value="limit", defaultValue="100") Integer limit, @RequestParam(value="offset", defaultValue="0") Integer offset) {

        return studentservice.list();
    }

}
