package com.telran.prof.homeworkSpring.repository;

import com.telran.prof.homeworkSpring.model.Tea;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@Component
public class TeaInMemoryRepos {

    private Map<String, Tea> teaStorage = new HashMap<>();

    public TeaInMemoryRepos() {
        init();
    }

    private void init() {
        Tea tea_Lime = new Tea("Lime Tea");
        Tea tea_Chamomile = new Tea("Chamomile Tea");
        Tea tea_Rose = new Tea("Rose Tea");
        Tea tea_Ceylon = new Tea("Ceylon Tea");
        Tea tea_Georgian = new Tea("Georgian Tea");

        teaStorage.put(tea_Lime.getId(), tea_Lime);
        teaStorage.put(tea_Chamomile.getId(), tea_Chamomile);
        teaStorage.put(tea_Rose.getId(), tea_Rose);
        teaStorage.put(tea_Ceylon.getId(), tea_Ceylon);
        teaStorage.put(tea_Georgian.getId(), tea_Georgian);
    }

    public Set<Tea> getAll() {
        return new HashSet<>(teaStorage.values());
    }

    public Tea add(Tea tea) {
        Tea newTea = new Tea(tea.getName());
        teaStorage.put(newTea.getId(), newTea);
        return newTea;
    }

    public Tea getById(String uuid){
        return teaStorage.get(uuid);

    }
}
