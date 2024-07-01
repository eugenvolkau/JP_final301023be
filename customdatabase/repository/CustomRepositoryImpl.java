package com.telrun.org.customdatabase.repository;

import com.telrun.org.customdatabase.model.Custom;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CustomRepositoryImpl implements CustomRepository {

    private Map<String, Custom> register = new HashMap<>();

    @PostConstruct
    private void init() {
        Custom customOne = new Custom(UUID.randomUUID().toString(), "Micel", "Jackson", "jackson@gmail.dok", "+04952222222");
        Custom customTwo = new Custom(UUID.randomUUID().toString(), " Mick", "Jagger", "RollingStones@gmail.dok", "+03557777777");
        Custom customThree = new Custom(UUID.randomUUID().toString(), "John", "Lennon", "Beatles@gmail.dok", "+025511111111");
        register.put(customOne.getId(), customOne);
        register.put(customTwo.getId(), customTwo);
        register.put(customThree.getId(), customThree);
    }

    @Override
    public Custom create(Custom custom) {
        Custom createCustom = new Custom(custom.getFirstName(), custom.getLastName(), custom.getEMail(), custom.getPhoneNum());
        createCustom.setId(UUID.randomUUID().toString());
        register.put(createCustom.getId(), createCustom);
        return createCustom;
    }

    @Override
    public List<Custom> getAll() {
        return new ArrayList<>(register.values());
    }

    @Override
    public Custom findById(String id) {
        return register.get(id);
    }

    @Override
    public void liquidate(String id) {
        register.remove(id);
    }
}
