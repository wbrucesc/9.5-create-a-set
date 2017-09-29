package com.will;

public class Main {
    public static void main(String[] args) {

        Set firstSet = new Set();

        firstSet.addNew(1);         //adds new number to set
        firstSet.addNew(23);        //" "
        firstSet.addNew(1);         //not allowed to be added since already in set
        firstSet.delete(23);        //deletes number from set
        firstSet.addNew(12);
        firstSet.addNew(48);
        firstSet.addNew(55);
        firstSet.addNew(56);
        firstSet.values();                     //gets values in set

        System.out.println(firstSet.getSize());            //prints length of set
        System.out.println(firstSet.values());             //prints all values in set
    }

}
