package com.kevinthelago.securedapi.controller;

import com.kevinthelago.securedapi.dao.Fortune;
import com.kevinthelago.securedapi.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FortuneController {

    @Autowired
    FortuneService service;


    @PostMapping("/fortune")
    public Fortune createFortune(@RequestParam("phrase") String phrase) {
        return service.createFortune(phrase);
    }

    @GetMapping("/fortune")
    public Fortune getFortune(@RequestParam("id") long id) {
        return service.getFortune(id);
    }

    @GetMapping("/fortune/random")
    public Fortune getRandomFortune() {
        return service.getRandomFortune();
    }

    @PutMapping("/fortune")
    public Fortune updateFortune(@RequestBody Fortune fortune) {
        return service.updateFortune(fortune);
    }

    @DeleteMapping("/fortune")
    public Fortune deleteFortune(@RequestParam("id") long id) {
        return service.deleteFortune(id);
    }

}
