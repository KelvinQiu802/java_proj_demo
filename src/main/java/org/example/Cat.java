package org.example;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}
