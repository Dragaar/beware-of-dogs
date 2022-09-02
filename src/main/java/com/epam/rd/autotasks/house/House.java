package com.epam.rd.autotasks.house;

import java.util.ArrayList;
import java.util.List;

public class House <E> {

    private final List<E> residents = new ArrayList<E>();

    public void enter(E resident) {

         residents.add(resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("There are following residents in the house:\n");
        for (E resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }
}
