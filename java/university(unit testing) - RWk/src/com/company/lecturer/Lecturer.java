package com.company.lecturer;

public class Lecturer {

    private String name;

    public Lecturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                '}';
    }
}
