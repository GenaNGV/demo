package by.itechart.demo.controller;

import by.itechart.demo.model.Student;
import by.itechart.demo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class DataController {

    private final Logger log = LoggerFactory.getLogger(DataController.class);

    @Autowired
    StudentService studentService;

    @RequestMapping("/list")
    public Collection<Student> students(@RequestParam(value="limit", defaultValue="100") Integer limit, @RequestParam(value="offset", defaultValue="0") Integer offset) {

        log.debug("students list");
        
        return studentService.list();
    }

}
