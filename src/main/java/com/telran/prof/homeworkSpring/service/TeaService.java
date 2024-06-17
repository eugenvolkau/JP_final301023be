package com.telran.prof.homeworkSpring.service;

import com.telran.prof.homeworkSpring.model.Tea;

import java.util.Set;

public interface TeaService {

    Set<Tea> getAll();

    Tea getById(String uuid);

    Tea add(Tea tea);

}
