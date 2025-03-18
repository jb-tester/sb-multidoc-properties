package com.mytests.spring.sbmultidocproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * *
 * <p>Created by irina on 13.11.2020.</p>
 * <p>Project: sb-multidoc-properties</p>
 * *
 */
@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    private MyService service;
    @Value("${my.props.prop1}")
    private String prop1;
    @Value("${my.props.prop2}")
    private String prop2;
    @Value("${my.props.prop3}")
    private String prop3;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("home_attr1",this.prop1);
        model.addAttribute("home_attr2", service.getHomeService());
        model.addAttribute("home_attr3", this.prop3);
        return "home";
    }

    @GetMapping("/test1")
    public String test1(Model model) {
        model.addAttribute("test1_attr1",this.prop2);
        model.addAttribute("test1_attr2", service.getTest1Service());
        return "test1";
    }
}
