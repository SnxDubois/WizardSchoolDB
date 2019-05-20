package com.wildcodeschool.wizardSchool.Controller;

public class School {
    private int id;
    private String name;
    private int capacity;
    private String country;

    public School(int id, String name, int capacity, String country) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCountry() {
        return country;
    }
}
