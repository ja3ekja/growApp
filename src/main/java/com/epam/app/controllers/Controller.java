package com.epam.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jacek on 24.01.17.
 */
@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "!";
    }
}
