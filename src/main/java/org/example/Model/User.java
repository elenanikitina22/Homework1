package org.example.Model;

public class User {
    private String name;

    public User(String name)
    {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return getName().equals(obj.toString());
    }
}