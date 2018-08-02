package by.itechart.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
@EnableAutoConfiguration
public class TemplateController {

    private final Logger log = LoggerFactory.getLogger(TemplateController.class);

    @GetMapping("/")
    public String index(Model model) {

        log.debug("index");

        return "index";
    }
}
