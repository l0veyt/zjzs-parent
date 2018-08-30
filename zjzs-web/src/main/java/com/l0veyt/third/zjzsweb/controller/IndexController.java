package com.l0veyt.third.zjzsweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/", "index"})
    public String index() {
        return "index";
    }
}
