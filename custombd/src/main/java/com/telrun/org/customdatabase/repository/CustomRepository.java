package com.telrun.org.customdatabase.repository;

import com.telrun.org.customdatabase.model.Custom;

import java.util.List;

public interface CustomRepository {

    Custom create(Custom custom);

    List<Custom> getAll();

    Custom findById(String id);

    void liquidate(String id);
}
