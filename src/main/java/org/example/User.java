package org.example;

public class User {

    private Integer id;

    private String name;

    public User() {

    }

    public User(Integer id, String name) {

        this.id = id;
        this.name = name;
    }

//    @Print
//    void print() {
//        //
//    }

    @Override
    public String toString() {

        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
