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
import java.util.HashMap;
import java.util.Map;

@RestController
public class DataController {

    private final Logger log = LoggerFactory.getLogger(DataController.class);

    @Autowired
    StudentService studentService;

    @RequestMapping("/list")
    public Map<String, Object> students(@RequestParam(value="limit", defaultValue="5") Integer limit, @RequestParam(value="offset", defaultValue="0") Integer offset) {

        log.debug("students list");

        Map<String, Object> result = new HashMap<>();

        Collection<Student> students = studentService.list(offset, limit);

        result.put("students", students);
        result.put("total", studentService.getCount());

        return result;
    }

}
