package com.nilesh.nilesh.Cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cont {

    @GetMapping("/")
    String show() {
        return "In Nilesh";
    }
}
