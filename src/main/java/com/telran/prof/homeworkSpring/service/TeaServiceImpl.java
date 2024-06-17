package com.telran.prof.homeworkSpring.service;

import com.telran.prof.homeworkSpring.model.Tea;
import com.telran.prof.homeworkSpring.repository.TeaInMemoryRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TeaServiceImpl implements TeaService{

    @Autowired
    private TeaInMemoryRepos repos;

    @Override
    public Set<Tea> getAll(){
        return repos.getAll();
    }
    @Override
    public Tea getById(String uuid){
        return repos.getById(uuid);
    }
    @Override
    public Tea add(Tea tea){
        return repos.add(tea);
    }
}
