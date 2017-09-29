package com.will;

import java.util.ArrayList;

public class Set {

    private ArrayList<Integer> mySet = new ArrayList<Integer>();

    public void addNew(int newNumber) {
        boolean inList = false;

        for (int i = 0; i < mySet.size(); i++) {
            if (newNumber == mySet.get(i)){
                return;
            }
        }

        if (!inList) {
            mySet.add(newNumber);
        }
    }

    public void delete(int dropNumber) {
        for (int i = 0; i < mySet.size(); i++) {
            if (dropNumber == mySet.get(i)) {
                mySet.remove(i);
            }
        }
    }

    public ArrayList<Integer> values() {
        return mySet;
    }

    public int getSize() {
        return mySet.size();
    }
}
