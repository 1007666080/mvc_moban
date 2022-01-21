package com.x.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Lenovo
 * @Date 2022-01-21 10:22
 */
@Controller
public class ControllerTest {
    @RequestMapping("/aaa")
    public String index() {
        return "index";
    }
}
