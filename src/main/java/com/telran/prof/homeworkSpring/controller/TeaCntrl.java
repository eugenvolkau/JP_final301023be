package com.telran.prof.homeworkSpring.controller;

import com.telran.prof.homeworkSpring.model.Tea;
import com.telran.prof.homeworkSpring.service.TeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/teas")

public class TeaCntrl {

    @Autowired
    private TeaService teaService;

    @GetMapping
    public Set<Tea> getAll(){
        return teaService.getAll();
    }

    @GetMapping("/{uuid}")
    public Tea getById(@PathVariable String uuid){
        return teaService.getById(uuid);
    }

    @PostMapping
    public  Tea add(@RequestBody Tea tea){
        return teaService.add(tea);
    }

}
