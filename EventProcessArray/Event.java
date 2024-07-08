package com.telran.prof.hometask.EventProcessArray;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Event extends Thread {

    private List<List<String>> strings;

    public Event(List<List<String>> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        while (true) {
            sleepNow(1);
            List<String> list = new ArrayList<>();
            EventCreator.eventCounter.getAndIncrement();
            synchronized (strings) {
                strings.add(elementEvent(list));
                //sleepNow(5000);
                strings.notify();
            }
        }
    }

    private void sleepNow(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<String> elementEvent(List<String> list) {
        HashMap<String, String> usersNameIP = new HashMap<>();
        usersNameIP.put("190.30.105.60", "Karlson");
        usersNameIP.put("190.31.105.61", "Pinockio");
        usersNameIP.put("190.31.105.62", "Shweik");
        usersNameIP.put("190.31.105.63", "Jerry");
        usersNameIP.put("190.31.105.64", "Rocky");
        usersNameIP.put("190.31.105.65", "Terminator");
        usersNameIP.put("190.31.105.66", "Vito Korleone");
        usersNameIP.put("190.31.105.67", "Cleopatra");
        usersNameIP.put("190.31.105.68", "Munchausen");
        usersNameIP.put("190.31.105.69", "The Snow Queen");

        sleepNow(1);
        String userIP = String.valueOf(usersNameIP.keySet()
                .toArray()[new Random().nextInt(usersNameIP
                .keySet().toArray().length)]);

        Optional<String> userName = usersNameIP.entrySet().stream()
                .filter(k -> userIP.equals(k.getKey()))
                .map(HashMap.Entry::getValue)
                .findFirst();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String status = String.valueOf(EventState.randomDirection());

        list.add(userName.get());
        list.add(userIP);
        list.add(localDateTime.toString());
        list.add(status);

        return list;
    }
}


