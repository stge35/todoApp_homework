package com.codestates.todoAppHomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommandationController {

    @GetMapping("/")
    public String todoApp(){
        return "To-do Application";
    }
}
