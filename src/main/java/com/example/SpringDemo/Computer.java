package com.example.SpringDemo;

public class Computer {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Computer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
