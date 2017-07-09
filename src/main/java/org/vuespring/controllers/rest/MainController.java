package org.vuespring.controllers.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by User on 09.07.2017.
 */

@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping("/")
    public String hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        model.addAttribute("name", name);
        return "index";
    }
}
