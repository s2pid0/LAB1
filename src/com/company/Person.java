package com.company;

public class Person {

    String name;
    long phnumber;

    public Person(String name, long phnumber) {
        this.name = name;
        this.phnumber = phnumber;

    }

    public String getName(){
        return name;
    }

    public long getPhnumber(){
        return phnumber;
    }

    public long changeNumber( long num){
        this.phnumber = num;
        return phnumber;
    }

}
