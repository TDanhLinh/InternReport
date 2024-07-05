package com.example.testhttp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class HttpController {
    @GetMapping("/json")
    public List<Person> get() {
        List<Person> personList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++)
            personList.add(new Person(i, "Test" + i, random.nextInt(100 - 1 + 1) + 1, "Test" + i + "@gmail.com"));

        return personList;
    }
}