package by.itechart.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TemplateController {

    private final Logger log = LoggerFactory.getLogger(TemplateController.class);

    @GetMapping("/home")
    public String index() {

        log.debug("index");

        return "index.html";
    }

    @GetMapping("/students")
    public String students() {
        return "students.html";
    }
}
