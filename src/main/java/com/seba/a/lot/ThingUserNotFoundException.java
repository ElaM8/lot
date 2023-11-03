package com.seba.a.lot;
public class ThingUserNotFoundException extends RuntimeException {
    public ThingUserNotFoundException() {
        super("Sorry! Something went wrong fetching that for you.");
    }
}