package com.telrun.org.customdatabase.controller;

import com.telrun.org.customdatabase.model.Custom;
import com.telrun.org.customdatabase.service.CustonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customs")
public class CustomController {

    @Autowired
    private CustonService service;

    @PostMapping
    public Custom creteCustom(@RequestBody Custom custom) {
        return service.create(custom);
    }

    @GetMapping
    public List<Custom> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Custom getById(@PathVariable String id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void liquidateById(@PathVariable String id) {
        service.liquidate(id);
    }
}

