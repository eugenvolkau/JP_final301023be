package com.telran.prof.hometask.EventProcessArray;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class EventCreator {

    public static AtomicInteger eventCounter = new AtomicInteger();

    public static void main(String[] args) {
        List<List<String>> strings = new ArrayList<>();
        eventCounter.set(0);
        new Thread(new Event(strings)).start();
        new Thread(new WriterOfEvent(strings)).start();
        new Thread(new WriterOfEvent(strings)).start();
        new Thread(new WriterOfEvent(strings)).start();
        new Thread(new WriterOfEvent(strings)).start();
    }
}
