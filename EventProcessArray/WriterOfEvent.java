package com.telran.prof.hometask.EventProcessArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WriterOfEvent extends Thread {

    private final List<List<String>> list;

    public WriterOfEvent(List<List<String>> list) {
        this.list = list;
    }

    @Override
    public void run() {
        sleepNow(1);
        while (true) {
            synchronized (list) {

                if (!list.isEmpty()) {
                    List<String> s = list.getFirst();

                    System.out.println("incomen list  " + list + " -> " + EventCreator.eventCounter);
                    Iterator<String> itera = s.iterator();
                    List<String> list1 = new ArrayList<>();
                    while (itera.hasNext()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Handler ").append(Thread.currentThread().getName() + "   id=").append(EventCreator.eventCounter + " - ").append(itera.next());

                        list1.add(sb.toString());
                    }
                    list1.stream().forEach(System.out::println);

                    list.removeFirst();
                } else {
                    System.out.println("  ------>");

                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
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
}