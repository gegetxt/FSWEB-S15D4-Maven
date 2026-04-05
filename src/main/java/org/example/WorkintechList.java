package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<Object> {

    @Override
    public boolean add(Object element) {
        if (contains(element)) {
            return false;
        }

        boolean added = super.add(element);
        sort();
        return added;
    }

    public void sort() {
        Collections.sort((ArrayList) this);
    }

    @Override
    public boolean remove(Object element) {
        boolean removed = super.remove(element);

        if (removed) {
            sort();
        }

        return removed;
    }
}