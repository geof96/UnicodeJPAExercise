package com.example.unicodejpaexercise.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char) i;
        return "Unicode is " + i + " and the char representation is " + c;
    }

    @GetMapping("/char/{c}")
    public int charToUnicode(@PathVariable char c) {
        int i = c;
        return  i;
    }


}
