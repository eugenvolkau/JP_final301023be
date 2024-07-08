package com.telran.prof.hometask.EventProcessArray;

import java.util.Random;

public enum EventState {
    SUCCESS,
    REQUESTERROR,
    ACCESSDENIED;

    private static final Random PRNG = new Random();

    public static EventState randomDirection() {
        EventState[] directions = values();
        return directions[PRNG.nextInt(directions.length)];
    }
}
