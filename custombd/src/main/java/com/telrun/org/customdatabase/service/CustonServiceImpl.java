package com.telrun.org.customdatabase.service;

import com.telrun.org.customdatabase.model.Custom;
import com.telrun.org.customdatabase.repository.CustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustonServiceImpl implements CustonService {

    @Autowired
    private CustomRepository repository;

    @Override
    public Custom create(Custom custom) {

        return repository.create(custom);
    }

    @Override
    public List<Custom> getAll() {

        return repository.getAll();
    }

    @Override
    public Custom findById(String id) {

        return repository.findById(id);
    }

    @Override
    public void liquidate(String id) {
        repository.liquidate(id);
    }
}
